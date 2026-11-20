package a6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import f6.SystemIdInfo;
import f6.WorkGenerationalId;
import f6.j0;
import f6.k0;
import f6.o1;
import f6.v;
import g6.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x5.f0;
import x5.o0;
import x5.w;
import y5.u;

/* loaded from: classes.dex */
public class f implements u {

    /* renamed from: f, reason: collision with root package name */
    public static final String f114f = w.i("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f115a;
    public final JobScheduler b;

    /* renamed from: c, reason: collision with root package name */
    public final d f116c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f117d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.a f118e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.c(context), new d(context, aVar.getClock(), aVar.getIsMarkingJobsAsImportantWhileForeground()));
    }

    public static void d(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null || g10.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = g10.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    public static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            w.e().d(f114f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static List<Integer> f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            WorkGenerationalId h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.getWorkSpecId())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b = c.b(jobScheduler);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static WorkGenerationalId h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new WorkGenerationalId(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler c10 = c.c(context);
        List<JobInfo> g10 = g(context, c10);
        List<String> c11 = workDatabase.Z().c();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                WorkGenerationalId h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.getWorkSpecId());
                } else {
                    e(c10, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = c11.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                w.e().a(f114f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.i();
        try {
            k0 c02 = workDatabase.c0();
            Iterator<String> it2 = c11.iterator();
            while (it2.hasNext()) {
                c02.q(it2.next(), -1L);
            }
            workDatabase.V();
            workDatabase.p();
            return z10;
        } catch (Throwable th2) {
            workDatabase.p();
            throw th2;
        }
    }

    @Override // y5.u
    public void a(j0... j0VarArr) {
        n nVar = new n(this.f117d);
        for (j0 j0Var : j0VarArr) {
            this.f117d.i();
            try {
                j0 k10 = this.f117d.c0().k(j0Var.id);
                if (k10 == null) {
                    w.e().k(f114f, "Skipping scheduling " + j0Var.id + " because it's no longer in the DB");
                    this.f117d.V();
                } else if (k10.state != o0.c.f35307a) {
                    w.e().k(f114f, "Skipping scheduling " + j0Var.id + " because it is no longer enqueued");
                    this.f117d.V();
                } else {
                    WorkGenerationalId a10 = o1.a(j0Var);
                    SystemIdInfo d10 = this.f117d.Z().d(a10);
                    int b = d10 != null ? d10.systemId : nVar.b(this.f118e.getMinJobSchedulerId(), this.f118e.getMaxJobSchedulerId());
                    if (d10 == null) {
                        this.f117d.Z().a(v.a(a10, b));
                    }
                    j(j0Var, b);
                    this.f117d.V();
                }
            } finally {
                this.f117d.p();
            }
        }
    }

    @Override // y5.u
    public void b(String str) {
        List<Integer> f10 = f(this.f115a, this.b, str);
        if (f10 == null || f10.isEmpty()) {
            return;
        }
        Iterator<Integer> it = f10.iterator();
        while (it.hasNext()) {
            e(this.b, it.next().intValue());
        }
        this.f117d.Z().e(str);
    }

    @Override // y5.u
    public boolean c() {
        return true;
    }

    public void j(j0 j0Var, int i10) {
        JobInfo a10 = this.f116c.a(j0Var, i10);
        w e10 = w.e();
        String str = f114f;
        e10.a(str, "Scheduling work ID " + j0Var.id + "Job ID " + i10);
        try {
            if (this.b.schedule(a10) == 0) {
                w.e().k(str, "Unable to schedule work ID " + j0Var.id);
                if (j0Var.expedited && j0Var.outOfQuotaPolicy == f0.f35273a) {
                    j0Var.expedited = false;
                    w.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", j0Var.id));
                    j(j0Var, i10);
                }
            }
        } catch (IllegalStateException e11) {
            String a11 = c.a(this.f115a, this.f117d, this.f118e);
            w.e().c(f114f, a11);
            IllegalStateException illegalStateException = new IllegalStateException(a11, e11);
            x2.a<Throwable> l10 = this.f118e.l();
            if (l10 == null) {
                throw illegalStateException;
            }
            l10.accept(illegalStateException);
        } catch (Throwable th2) {
            w.e().d(f114f, "Unable to schedule " + j0Var, th2);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f115a = context;
        this.b = jobScheduler;
        this.f116c = dVar;
        this.f117d = workDatabase;
        this.f118e = aVar;
    }
}
