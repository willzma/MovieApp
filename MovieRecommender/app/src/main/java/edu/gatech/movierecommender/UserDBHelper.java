package edu.gatech.movierecommender;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by theon on 3/12/2016.
 */
public class UserDBHelper {

    // Increment database version when updating schema
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "movieapp.db";

    public static boolean checkIfInDB(String tableName, String dbField, String fieldValue) {
        String query = "Select 1 from " + tableName + " where " + dbField + " = \'" + fieldValue + "\' LIMIT 1";
        Cursor cursor = World.DB.rawQuery(query, null);
            if (cursor.getCount() <= 0) {
                cursor.close();
                return false;
            }
        cursor.close();
        return true;
    }

    public static void lockUser(String user) {
        String query = "UPDATE users SET status = \'Locked\' WHERE username = \'" + user + "\'";

        World.DB.execSQL(query);
    }

    public static void banUser(String user) {
        String query = "UPDATE users SET status = \'Banned\' WHERE username = \'" + user + "\'";

        World.DB.execSQL(query);
    }

    public static void setMajor(String user, String major) {
        String query = "UPDATE users SET major = \'" + major + "\' WHERE username = \'" + user + "\'";

        World.DB.execSQL(query);
    }

    public static void setDescription(String user, String description) {
        String query = "UPDATE users SET description = \'" + description + "\' WHERE username = \'" + user + "\'";

        World.DB.execSQL(query);
    }

    public static String getEmail(String user) {
        Cursor cursor = null;
        String email = "";

        String query = "SELECT email FROM users WHERE username = \'" + user + "\'";

        try {
            cursor = World.DB.rawQuery(query, null);

            if (cursor.getCount() > 0)  {
                cursor.moveToFirst();
                email = cursor.getString(cursor.getColumnIndex("email"));
            }
        } catch (SQLiteException e) {
            System.out.println("Fatal DB error");
        } finally {
            cursor.close();
        }

        return email;
    }

    public static String getName(String user) {
        Cursor cursor = null;
        String name = "";

        String query = "SELECT name FROM users WHERE username = \'" + user + "\'";

        try {
            cursor = World.DB.rawQuery(query, null);

            if (cursor.getCount() > 0)  {
                cursor.moveToFirst();
                name = cursor.getString(cursor.getColumnIndex("name"));
            }
        } catch (SQLiteException e) {
            System.out.println("Fatal DB error");
        } finally {
            cursor.close();
        }

        return name;
    }

    public static String getStatus(String user) {
        Cursor cursor = null;
        String status = "";

        String query = "SELECT status FROM users WHERE username = \'" + user + "\'";

        try {
            cursor = World.DB.rawQuery(query, null);

            if (cursor.getCount() > 0)  {
                cursor.moveToFirst();
                status = cursor.getString(cursor.getColumnIndex("status"));
            }
        } catch (SQLiteException e) {
            System.out.println("Fatal DB error");
        } finally {
            cursor.close();
        }

        return status;
    }

    public static String getMajor(String user) {
        Cursor cursor = null;
        String major = "";

        String query = "SELECT major FROM users WHERE username = \'" + user + "\'";

        try {
            cursor = World.DB.rawQuery(query, null);

            if (cursor.getCount() > 0)  {
                cursor.moveToFirst();
                major = cursor.getString(cursor.getColumnIndex("major"));
            }
        } catch (SQLiteException e) {
            System.out.println("Fatal DB error");
        } finally {
            cursor.close();
        }

        return major;
    }

    public static String getDescription(String user) {
        Cursor cursor = null;
        String desc = "";

        String query = "SELECT description FROM users WHERE username = \'" + user + "\'";

        try {
            cursor = World.DB.rawQuery(query, null);

            if (cursor.getCount() > 0)  {
                cursor.moveToFirst();
                desc = cursor.getString(cursor.getColumnIndex("description"));
            }
        } catch (SQLiteException e) {
            System.out.println("Fatal DB error");
        } finally {
            cursor.close();
        }

        return desc;
    }

    public static int getPassHash(String user) {
        Cursor cursor = null;
        int passHash = 0;

        String query = "SELECT password FROM users WHERE username = \'" + user + "\'";

        try {
            cursor = World.DB.rawQuery(query, null);

            if (cursor.getCount() > 0)  {
                cursor.moveToFirst();
                passHash = cursor.getInt(cursor.getColumnIndex("password"));
            }
        } catch (SQLiteException e) {
            System.out.println("Fatal DB error");
        } finally {
            cursor.close();
        }

        return passHash;
    }
}