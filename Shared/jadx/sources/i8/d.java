package i8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20264a;
    public final j8.d b;

    /* renamed from: c, reason: collision with root package name */
    public final f f20265c;

    public d(Context context, j8.d dVar, f fVar) {
        this.f20264a = context;
        this.b = dVar;
        this.f20265c = fVar;
    }

    @Override // i8.x
    public void a(b8.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f20264a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f20264a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (!z10 && d(jobScheduler, c10, i10)) {
            f8.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long s02 = this.b.s0(oVar);
        JobInfo.Builder c11 = this.f20265c.c(new JobInfo.Builder(c10, componentName), oVar.d(), s02, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", m8.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c11.setExtras(persistableBundle);
        f8.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f20265c.g(oVar.d(), s02, i10)), Long.valueOf(s02), Integer.valueOf(i10));
        jobScheduler.schedule(c11.build());
    }

    @Override // i8.x
    public void b(b8.o oVar, int i10) {
        a(oVar, i10, false);
    }

    public int c(b8.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f20264a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(m8.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean d(JobScheduler jobScheduler, int i10, int i11) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                if (i12 >= i11) {
                    return true;
                }
            }
        }
        return false;
    }
}
