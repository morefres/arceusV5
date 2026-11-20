package xl;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import ju.g1;
import ju.v1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public MessageBus f35603a;
    public Context b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<Connection> f35604c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f35605a = new e(MessageBus.f());
    }

    public static /* synthetic */ JSONObject c(Long l10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firstname", "");
            jSONObject.put("lastname", "");
            jSONObject.put("phonenumber", new JSONArray());
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while creating new contact object", e10);
            return jSONObject;
        }
    }

    public static e m() {
        return a.f35605a;
    }

    public JSONArray e() {
        String string;
        if (this.b == null) {
            return new JSONArray();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor query = this.b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "mimetype", "data1", "data2", "data3"}, "mimetype IN (?, ?)", new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name"}, "contact_id ASC");
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("contact_id");
                int columnIndex2 = query.getColumnIndex("mimetype");
                int columnIndex3 = query.getColumnIndex("data1");
                int columnIndex4 = query.getColumnIndex("data2");
                int columnIndex5 = query.getColumnIndex("data3");
                while (query.moveToNext()) {
                    JSONObject jSONObject = (JSONObject) linkedHashMap.computeIfAbsent(Long.valueOf(query.getLong(columnIndex)), new Function() { // from class: xl.d
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return e.c((Long) obj);
                        }
                    });
                    String string2 = query.getString(columnIndex2);
                    int hashCode = string2.hashCode();
                    if (hashCode != -1079224304) {
                        if (hashCode == 684173810 && string2.equals("vnd.android.cursor.item/phone_v2") && (string = query.getString(columnIndex3)) != null) {
                            jSONObject.getJSONArray("phonenumber").put(string);
                        }
                    } else if (string2.equals("vnd.android.cursor.item/name")) {
                        String string3 = query.getString(columnIndex4);
                        String string4 = query.getString(columnIndex5);
                        if (string3 != null) {
                            jSONObject.put("firstname", string3);
                        }
                        if (string4 != null) {
                            jSONObject.put("lastname", string4);
                        }
                    }
                }
            } finally {
            }
        }
        if (query != null) {
            query.close();
        }
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject2 : linkedHashMap.values()) {
            if (jSONObject2.getJSONArray("phonenumber").length() > 0) {
                jSONArray.put(jSONObject2);
            }
        }
        return jSONArray;
    }

    public final String f() {
        Context context = this.b;
        return context == null ? "" : context.getResources().getConfiguration().getLocales().get(0).getCountry();
    }

    public final /* synthetic */ void i() {
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONArray = e();
            } catch (SecurityException e10) {
                Log.e("ContactsProtocol", "Permission denied while enumerating contacts", e10);
                jSONArray = new JSONArray();
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("countryCode", f());
                jSONObject.put("contacts", jSONArray);
            }
            this.f35603a.m("ContactsProtocol", "getContacts", jSONObject, 0, new HashMap());
        } catch (JSONException e11) {
            Log.e("ContactsProtocol", "JSON exception while handling get contacts request", e11);
            this.f35603a.m("ContactsProtocol", "getContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onGetContacts: " + jSONObject.toString());
        v1.a(g1.b()).execute(new Runnable() { // from class: xl.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.i();
            }
        });
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onSupportsContacts: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", true);
            this.f35603a.m("ContactsProtocol", "SupportsContacts", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while handling supports contacts request: " + e10.toString());
            this.f35603a.m("ContactsProtocol", "SupportsContacts", new JSONObject(), 13, new HashMap());
        }
    }

    public void l(Context context) {
        this.b = context;
    }

    public e(MessageBus messageBus) {
        ArrayList<Connection> arrayList = new ArrayList<>();
        this.f35604c = arrayList;
        this.f35603a = messageBus;
        arrayList.add(messageBus.w("ContactsProtocol", "getContacts", new Callback() { // from class: xl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                e.this.g(jSONObject);
            }
        }));
        this.f35604c.add(messageBus.w("ContactsProtocol", "SupportsContacts", new Callback() { // from class: xl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                e.this.h(jSONObject);
            }
        }));
    }
}
