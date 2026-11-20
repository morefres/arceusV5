package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFg1cSDK {
    private StringBuilder AFLogger = new StringBuilder();
    private final List<AFa1ySDK> unregisterClient = new ArrayList();
    private final String AFKeystoreWrapper = null;

    public enum AFa1ySDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private AFa1ySDK registerClient() {
        if (this.unregisterClient.isEmpty()) {
            throw new AFg1hSDK("Nesting problem");
        }
        return this.unregisterClient.get(r0.size() - 1);
    }

    public final AFg1cSDK AFKeystoreWrapper(AFa1ySDK aFa1ySDK, String str) {
        if (this.unregisterClient.isEmpty() && this.AFLogger.length() > 0) {
            throw new AFg1hSDK("Nesting problem: multiple top-level roots");
        }
        AFLogger();
        this.unregisterClient.add(aFa1ySDK);
        this.AFLogger.append(str);
        return this;
    }

    public final void AFLogger(String str) {
        this.AFLogger.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\f') {
                this.AFLogger.append("\\f");
            } else if (charAt == '\r') {
                this.AFLogger.append("\\r");
            } else if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        this.AFLogger.append("\\b");
                        break;
                    case '\t':
                        this.AFLogger.append("\\t");
                        break;
                    case '\n':
                        this.AFLogger.append("\\n");
                        break;
                    default:
                        if (charAt <= 31) {
                            this.AFLogger.append(String.format(Locale.US, "\\u%04x", Integer.valueOf(charAt)));
                            break;
                        } else {
                            this.AFLogger.append(charAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb2 = this.AFLogger;
                sb2.append('\\');
                sb2.append(charAt);
            }
        }
        this.AFLogger.append("\"");
    }

    public final AFg1cSDK d(Object obj) {
        if (this.unregisterClient.isEmpty()) {
            throw new AFg1hSDK("Nesting problem");
        }
        if (((Class) AFa1bSDK.AFLogger((char) Gravity.getAbsoluteGravity(0, 0), 318 - (KeyEvent.getMaxKeyCode() >> 16), ExpandableListView.getPackedPositionChild(0L) + 38)).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1bSDK.getInstance;
                Object obj2 = map.get(-1545073677);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1bSDK.AFLogger((char) Gravity.getAbsoluteGravity(0, 0), 318 - (ViewConfiguration.getLongPressTimeout() >> 16), 37 - TextUtils.getOffsetBefore("", 0))).getDeclaredMethod("AFLogger", AFg1cSDK.class);
                    map.put(-1545073677, obj2);
                }
                ((Method) obj2).invoke(obj, objArr);
                return this;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (obj instanceof AFg1gSDK) {
            ((AFg1gSDK) obj).registerClient(this);
            return this;
        }
        AFLogger();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.f5410d) {
            this.AFLogger.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.AFLogger.append(AFg1gSDK.AFKeystoreWrapper((Number) obj));
            return this;
        }
        AFLogger(obj.toString());
        return this;
    }

    public final String toString() {
        if (this.AFLogger.length() == 0) {
            return null;
        }
        return this.AFLogger.toString();
    }

    public final AFg1cSDK unregisterClient(AFa1ySDK aFa1ySDK, AFa1ySDK aFa1ySDK2, String str) {
        AFa1ySDK registerClient = registerClient();
        if (registerClient != aFa1ySDK2 && registerClient != aFa1ySDK) {
            throw new AFg1hSDK("Nesting problem");
        }
        this.unregisterClient.remove(r2.size() - 1);
        this.AFLogger.append(str);
        return this;
    }

    public final void unregisterClient() {
        AFa1ySDK registerClient = registerClient();
        if (registerClient == AFa1ySDK.NONEMPTY_OBJECT) {
            this.AFLogger.append(',');
        } else if (registerClient != AFa1ySDK.EMPTY_OBJECT) {
            throw new AFg1hSDK("Nesting problem");
        }
        AFa1ySDK aFa1ySDK = AFa1ySDK.DANGLING_KEY;
        this.unregisterClient.set(r1.size() - 1, aFa1ySDK);
    }

    private void AFLogger() {
        if (this.unregisterClient.isEmpty()) {
            return;
        }
        AFa1ySDK registerClient = registerClient();
        if (registerClient == AFa1ySDK.EMPTY_ARRAY) {
            AFa1ySDK aFa1ySDK = AFa1ySDK.NONEMPTY_ARRAY;
            this.unregisterClient.set(r1.size() - 1, aFa1ySDK);
        } else {
            if (registerClient == AFa1ySDK.NONEMPTY_ARRAY) {
                this.AFLogger.append(',');
                return;
            }
            if (registerClient == AFa1ySDK.DANGLING_KEY) {
                this.AFLogger.append(":");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.NONEMPTY_OBJECT;
                this.unregisterClient.set(r1.size() - 1, aFa1ySDK2);
                return;
            }
            if (registerClient != AFa1ySDK.NULL) {
                throw new AFg1hSDK("Nesting problem");
            }
        }
    }
}
