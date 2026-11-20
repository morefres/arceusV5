package de;

import be.q1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final q1 f14576c = new q1("LocalTestingConfigParser");

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f14577a;
    public final u b = v.c();

    public d(XmlPullParser xmlPullParser) {
        this.f14577a = xmlPullParser;
    }

    public static v a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return v.f14610a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                final d dVar = new d(newPullParser);
                dVar.e("local-testing-config", new z() { // from class: de.y
                    @Override // de.z
                    public final void zza() {
                        d.this.d();
                    }
                });
                v e10 = dVar.b.e();
                fileReader.close();
                return e10;
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e11) {
            f14576c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e11.getMessage());
            return v.f14610a;
        }
    }

    public static /* synthetic */ void b(final d dVar) {
        for (int i10 = 0; i10 < dVar.f14577a.getAttributeCount(); i10++) {
            if ("defaultErrorCode".equals(dVar.f14577a.getAttributeName(i10))) {
                dVar.b.a(ce.a.a(dVar.f14577a.getAttributeValue(i10)));
            }
        }
        dVar.e("split-install-error", new z() { // from class: de.w
            @Override // de.z
            public final void zza() {
                d.c(d.this);
            }
        });
    }

    public static /* synthetic */ void c(d dVar) {
        String str = null;
        String str2 = null;
        for (int i10 = 0; i10 < dVar.f14577a.getAttributeCount(); i10++) {
            if ("module".equals(dVar.f14577a.getAttributeName(i10))) {
                str = dVar.f14577a.getAttributeValue(i10);
            }
            if ("errorCode".equals(dVar.f14577a.getAttributeName(i10))) {
                str2 = dVar.f14577a.getAttributeValue(i10);
            }
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), dVar.f14577a, null);
        }
        dVar.b.d().put(str, Integer.valueOf(ce.a.a(str2)));
        while (dVar.f14577a.next() != 3) {
        }
    }

    public final /* synthetic */ void d() {
        e("split-install-errors", new z() { // from class: de.x
            @Override // de.z
            public final void zza() {
                d.b(d.this);
            }
        });
    }

    public final void e(String str, z zVar) {
        while (true) {
            int next = this.f14577a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.f14577a.getEventType() == 2) {
                if (!this.f14577a.getName().equals(str)) {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.f14577a.getName()), this.f14577a, null);
                }
                zVar.zza();
            }
        }
    }
}
