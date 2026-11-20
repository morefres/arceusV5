package zk;

import com.roblox.platform.NoObfuscate;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class c implements NoObfuscate {
    public final String conversation_id;
    public final Map<String, String>[] messages;

    public c(String str, String[] strArr) {
        this.conversation_id = str;
        HashMap[] hashMapArr = new HashMap[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            HashMap hashMap = new HashMap();
            hashMap.put("content", strArr[i10]);
            hashMapArr[i10] = hashMap;
        }
        this.messages = hashMapArr;
    }
}
