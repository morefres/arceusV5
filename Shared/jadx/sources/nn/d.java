package nn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f27214a = b();

    public static String a(String str) {
        int i10;
        if (str.startsWith("&") && str.endsWith(";")) {
            String substring = str.substring(1, str.length() - 1);
            if (substring.startsWith("#")) {
                String substring2 = substring.substring(1);
                if (substring2.startsWith("x") || substring2.startsWith("X")) {
                    substring2 = substring2.substring(1);
                    i10 = 16;
                } else {
                    i10 = 10;
                }
                try {
                    int parseInt = Integer.parseInt(substring2, i10);
                    return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = f27214a.get(substring);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    public static Map<String, String> b() {
        HashMap hashMap = new HashMap();
        InputStream resourceAsStream = d.class.getResourceAsStream("/com/withpersona/sdk2/commonmark/internal/util/entities.txt");
        if (resourceAsStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!readLine.isEmpty()) {
                            int indexOf = readLine.indexOf("=");
                            hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                        }
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (IOException e10) {
                throw new IllegalStateException("Failed reading data for HTML named character references", e10);
            }
        }
        hashMap.put("NewLine", "\n");
        return hashMap;
    }
}
