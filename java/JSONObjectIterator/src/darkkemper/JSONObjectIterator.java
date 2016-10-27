package darkkemper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * Created by darkkemper on 21.06.16.
 */
public class JSONObjectIterator
{
    public JSONObjectIterator(JSONObject object)
    {
        try
        {
            this.go(object, "");
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    public void go(JSONObject object, String address)
    {
        Iterator<String> keys = object.keys();

        while (keys.hasNext())
        {
            String key = keys.next();

            Object value = object.get(key);

            if (value instanceof JSONObject)
            {
                this.go((JSONObject) value, address + "/" + key);
            }
            else if (value instanceof JSONArray)
            {
                this.go((JSONArray) value, address + "/" + key);
            }
            else
            {
                System.out.println(address + "/" + key + "/" + value + " ");
            }
        }
    }

    public void go(JSONArray object, String address)
    {
        for (int i = 0; i < object.length(); i++)
        {
            Object value = object.get(i);

            if (value instanceof JSONObject)
            {
                this.go((JSONObject) value, address + "/" + i);
            }
            else if (value instanceof JSONArray)
            {
                this.go((JSONArray) value, address + "/" + i);
            }
            else
            {
                System.out.println(address + "/" + i + "/" + value + " ");
            }
        }
    }
}
