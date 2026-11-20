package ek;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class g {
    public static long a(String str) {
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            q.k("rbx.utils", "Exception caught when converting string to date: " + str);
            long c10 = c(str);
            q.k("rbx.utils", "Parsing as alternate format: " + c10);
            return c10;
        }
    }

    public static Date b(String str) {
        String str2;
        String str3 = "";
        if (str.contains("+00:00")) {
            str = str.replace("+00:00", "");
        }
        if (str.length() == 19) {
            str2 = str + ".+00:00";
        } else if (str.contains(".Z")) {
            str2 = str.replace(".Z", ".+00:00");
        } else if (str.endsWith("Z")) {
            str2 = str.replace("Z", ".+00:00");
        } else {
            str2 = str + ".+00:00";
        }
        try {
            if (str2.length() > 29) {
                str2 = str2.substring(0, 23) + str2.substring(str2.length() - 6);
            } else if (str2.length() < 29) {
                int length = 29 - str2.length();
                for (int i10 = 0; i10 < length; i10++) {
                    str3 = str3 + "0";
                }
                str2 = str2.substring(0, 23 - length) + str3 + str2.substring(str2.length() - 6);
            }
            String str4 = str2.substring(0, 26) + str2.substring(27);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ");
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.parse(str4);
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid length for: " + str2, 0);
        }
    }

    public static long c(String str) {
        Matcher matcher = Pattern.compile("\\/Date\\((\\-?\\d*?)([\\+\\-]\\d*)?\\)\\/").matcher(str);
        if (matcher.matches()) {
            return Long.valueOf(matcher.group(1)).longValue();
        }
        return 0L;
    }
}
