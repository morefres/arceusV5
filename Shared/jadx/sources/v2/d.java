package v2;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.core.graphics.k;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import v2.g;
import w1.i;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final i<c, ProviderInfo> f33176a = new i<>(2);
    public static final Comparator<byte[]> b = new Comparator() { // from class: v2.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f33177a;

        public b(Context context, Uri uri) {
            this.f33177a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // v2.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f33177a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // v2.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f33177a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f33178a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f33179c;

        public c(String str, String str2, List<List<byte[]>> list) {
            this.f33178a = str;
            this.b = str2;
            this.f33179c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f33178a, cVar.f33178a) && Objects.equals(this.b, cVar.b) && Objects.equals(this.f33179c, cVar.f33179c);
        }

        public int hashCode() {
            return Objects.hash(this.f33178a, this.b, this.f33179c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : n2.e.c(resources, eVar.c());
    }

    public static g.a e(Context context, List<e> list, CancellationSignal cancellationSignal) {
        String h10;
        Typeface h11;
        n5.a.c("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (h11 = k.h((h10 = eVar.h()))) == null || k.j(h11) == null) {
                    ProviderInfo f10 = f(context.getPackageManager(), eVar, context.getResources());
                    if (f10 == null) {
                        return g.a.b(1, null);
                    }
                    arrayList.add(g(context, eVar, f10.authority, cancellationSignal));
                } else {
                    arrayList.add(new g.b[]{new g.b(h10, eVar.i())});
                }
            }
            return g.a.a(0, arrayList);
        } finally {
            n5.a.f();
        }
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        n5.a.c("FontProvider.getProvider");
        try {
            List<List<byte[]>> d10 = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), d10);
            ProviderInfo d11 = f33176a.d(cVar);
            if (d11 != null) {
                return d11;
            }
            String e10 = eVar.e();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e10, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + e10);
            }
            if (!resolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + e10 + ", but package was not " + eVar.f());
            }
            List<byte[]> b10 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b10, b);
            for (int i10 = 0; i10 < d10.size(); i10++) {
                ArrayList arrayList = new ArrayList(d10.get(i10));
                Collections.sort(arrayList, b);
                if (c(b10, arrayList)) {
                    f33176a.e(cVar, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            n5.a.f();
            return null;
        } finally {
            n5.a.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2, types: [v2.d$a] */
    public static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r16;
        a aVar;
        a aVar2;
        Uri withAppendedId;
        boolean z10;
        n5.a.c("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a a10 = a.a(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", FontsContractCompat.Columns.FILE_ID, FontsContractCompat.Columns.TTC_INDEX, FontsContractCompat.Columns.VARIATION_SETTINGS, FontsContractCompat.Columns.WEIGHT, FontsContractCompat.Columns.ITALIC, FontsContractCompat.Columns.RESULT_CODE};
                n5.a.c("ContentQueryWrapper.query");
                try {
                    try {
                        cursor = a10.b(build, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        if (cursor == null || cursor.getCount() <= 0) {
                            aVar = a10;
                        } else {
                            int columnIndex = cursor.getColumnIndex(FontsContractCompat.Columns.RESULT_CODE);
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex(FontsContractCompat.Columns.FILE_ID);
                            int columnIndex4 = cursor.getColumnIndex(FontsContractCompat.Columns.TTC_INDEX);
                            int columnIndex5 = cursor.getColumnIndex(FontsContractCompat.Columns.WEIGHT);
                            int columnIndex6 = cursor.getColumnIndex(FontsContractCompat.Columns.ITALIC);
                            while (cursor.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i11 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    aVar2 = a10;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    aVar2 = a10;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                int i12 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                                if (columnIndex6 != -1) {
                                    z10 = true;
                                    if (cursor.getInt(columnIndex6) == 1) {
                                        arrayList2.add(g.b.a(withAppendedId, i11, i12, z10, i10));
                                        a10 = aVar2;
                                    }
                                }
                                z10 = false;
                                arrayList2.add(g.b.a(withAppendedId, i11, i12, z10, i10));
                                a10 = aVar2;
                            }
                            aVar = a10;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        aVar.close();
                        return (g.b[]) arrayList.toArray(new g.b[0]);
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r16 = context;
                    if (cursor != null) {
                        cursor.close();
                    }
                    r16.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r16 = a10;
            }
        } finally {
            n5.a.f();
        }
    }
}
