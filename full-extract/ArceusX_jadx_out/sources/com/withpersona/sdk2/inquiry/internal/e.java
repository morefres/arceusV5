package com.withpersona.sdk2.inquiry.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.activity.result.IntentSenderRequest;
import ao.c1;
import aq.b;
import bq.a;
import bt.a;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.i;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.e;
import com.withpersona.sdk2.inquiry.document.network.g;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.document.step.b;
import com.withpersona.sdk2.inquiry.document.step.d;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.integration.a;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.b;
import com.withpersona.sdk2.inquiry.integration.fragment.d;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.a;
import com.withpersona.sdk2.inquiry.internal.c;
import com.withpersona.sdk2.inquiry.internal.f;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeService;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.f;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.internal.m;
import com.withpersona.sdk2.inquiry.internal.o;
import com.withpersona.sdk2.inquiry.internal.r;
import com.withpersona.sdk2.inquiry.internal.v;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.a;
import com.withpersona.sdk2.inquiry.internal.workflows.c;
import com.withpersona.sdk2.inquiry.internal.workflows.e;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager_Factory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_UserAgentFactory;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.a;
import com.withpersona.sdk2.inquiry.permissions.d;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.c;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.e;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.b;
import com.withpersona.sdk2.inquiry.steps.ui.styling.remoteFonts.RealFontDownloader;
import com.withpersona.sdk2.inquiry.tracking.C0704RealTrackingEventsLogger_Factory;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger_Factory_Impl;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache_Factory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule_TrackingEventsLoggerFactory;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider_Factory;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.d;
import com.withpersona.sdk2.inquiry.ui.h;
import com.withpersona.sdk2.inquiry.ui.k;
import com.withpersona.sdk2.inquiry.ui.network.b;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import com.withpersona.sdk2.inquiry.ui.uiStep.b;
import dn.j0;
import dn.o0;
import dn.r0;
import dn.s0;
import dn.x;
import dp.g;
import dq.k2;
import dq.m2;
import dq.n2;
import dt.g;
import dt.j;
import ep.y;
import fn.b0;
import fn.c;
import fn.d0;
import fn.i0;
import fo.b;
import fp.e0;
import fp.g0;
import go.h2;
import hp.c;
import hq.c0;
import hq.e0;
import hq.f0;
import io.z;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import jo.t0;
import jo.u0;
import jp.n;
import ju.l0;
import ju.p0;
import lp.e;
import mo.GovernmentIdHintWorker;
import mr.b2;
import mr.c2;
import mr.k6;
import no.c;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import oo.d1;
import oo.p;
import or.a;
import po.j1;
import po.k1;
import po.m0;
import po.n0;
import po.v0;
import po.w0;
import pp.l1;
import pp.m1;
import pr.g1;
import pr.h1;
import pr.i1;
import qr.c;
import rr.b;
import sm.h;
import vo.d;
import wp.c0;
import xn.g;
import xo.h0;
import xo.k0;
import xp.q0;
import xq.a;
import ym.a0;
import zn.a;

/* loaded from: classes3.dex */
public final class e {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public NetworkCoreModule f11508a;
        public com.withpersona.sdk2.inquiry.internal.network.f b;

        /* renamed from: c, reason: collision with root package name */
        public kp.q f11509c;

        /* renamed from: d, reason: collision with root package name */
        public dn.k f11510d;

        /* renamed from: e, reason: collision with root package name */
        public kp.w f11511e;

        /* renamed from: f, reason: collision with root package name */
        public oq.a f11512f;

        /* renamed from: g, reason: collision with root package name */
        public xo.n f11513g;

        /* renamed from: h, reason: collision with root package name */
        public kp.d f11514h;

        /* renamed from: i, reason: collision with root package name */
        public kp.i f11515i;

        /* renamed from: j, reason: collision with root package name */
        public up.f f11516j;

        /* renamed from: k, reason: collision with root package name */
        public op.e f11517k;

        /* renamed from: l, reason: collision with root package name */
        public jp.c f11518l;

        /* renamed from: m, reason: collision with root package name */
        public kq.b f11519m;

        /* renamed from: n, reason: collision with root package name */
        public bp.c f11520n;

        /* renamed from: o, reason: collision with root package name */
        public c0 f11521o;

        /* renamed from: p, reason: collision with root package name */
        public jq.c f11522p;

        /* renamed from: q, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.fallbackmode.a f11523q;

        /* renamed from: r, reason: collision with root package name */
        public nq.f f11524r;

        /* renamed from: s, reason: collision with root package name */
        public kp.c0 f11525s;

        /* renamed from: t, reason: collision with root package name */
        public wn.e f11526t;

        /* renamed from: u, reason: collision with root package name */
        public eo.g f11527u;

        /* renamed from: v, reason: collision with root package name */
        public TrackingEventsModule f11528v;

        public a a(com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar) {
            this.f11523q = (com.withpersona.sdk2.inquiry.internal.fallbackmode.a) dt.h.b(aVar);
            return this;
        }

        public xo.s b() {
            dt.h.a(this.f11508a, NetworkCoreModule.class);
            dt.h.a(this.b, com.withpersona.sdk2.inquiry.internal.network.f.class);
            dt.h.a(this.f11509c, kp.q.class);
            if (this.f11510d == null) {
                this.f11510d = new dn.k();
            }
            dt.h.a(this.f11511e, kp.w.class);
            dt.h.a(this.f11512f, oq.a.class);
            dt.h.a(this.f11513g, xo.n.class);
            dt.h.a(this.f11514h, kp.d.class);
            dt.h.a(this.f11515i, kp.i.class);
            if (this.f11516j == null) {
                this.f11516j = new up.f();
            }
            dt.h.a(this.f11517k, op.e.class);
            dt.h.a(this.f11518l, jp.c.class);
            dt.h.a(this.f11519m, kq.b.class);
            dt.h.a(this.f11520n, bp.c.class);
            if (this.f11521o == null) {
                this.f11521o = new c0();
            }
            if (this.f11522p == null) {
                this.f11522p = new jq.c();
            }
            dt.h.a(this.f11523q, com.withpersona.sdk2.inquiry.internal.fallbackmode.a.class);
            dt.h.a(this.f11524r, nq.f.class);
            dt.h.a(this.f11525s, kp.c0.class);
            if (this.f11526t == null) {
                this.f11526t = new wn.e();
            }
            if (this.f11527u == null) {
                this.f11527u = new eo.g();
            }
            dt.h.a(this.f11528v, TrackingEventsModule.class);
            return new f(this.f11508a, this.b, this.f11509c, this.f11510d, this.f11511e, this.f11512f, this.f11513g, this.f11514h, this.f11515i, this.f11516j, this.f11517k, this.f11518l, this.f11519m, this.f11520n, this.f11521o, this.f11522p, this.f11523q, this.f11524r, this.f11525s, this.f11526t, this.f11527u, this.f11528v);
        }

        public a c(kp.d dVar) {
            this.f11514h = (kp.d) dt.h.b(dVar);
            return this;
        }

        public a d(kq.b bVar) {
            this.f11519m = (kq.b) dt.h.b(bVar);
            return this;
        }

        public a e(kp.i iVar) {
            this.f11515i = (kp.i) dt.h.b(iVar);
            return this;
        }

        public a f(kp.q qVar) {
            this.f11509c = (kp.q) dt.h.b(qVar);
            return this;
        }

        public a g(nq.f fVar) {
            this.f11524r = (nq.f) dt.h.b(fVar);
            return this;
        }

        public a h(bp.c cVar) {
            this.f11520n = (bp.c) dt.h.b(cVar);
            return this;
        }

        public a i(oq.a aVar) {
            this.f11512f = (oq.a) dt.h.b(aVar);
            return this;
        }

        public a j(xo.n nVar) {
            this.f11513g = (xo.n) dt.h.b(nVar);
            return this;
        }

        public a k(com.withpersona.sdk2.inquiry.internal.network.f fVar) {
            this.b = (com.withpersona.sdk2.inquiry.internal.network.f) dt.h.b(fVar);
            return this;
        }

        public a l(jp.c cVar) {
            this.f11518l = (jp.c) dt.h.b(cVar);
            return this;
        }

        public a m(NetworkCoreModule networkCoreModule) {
            this.f11508a = (NetworkCoreModule) dt.h.b(networkCoreModule);
            return this;
        }

        public a n(op.e eVar) {
            this.f11517k = (op.e) dt.h.b(eVar);
            return this;
        }

        public a o(kp.w wVar) {
            this.f11511e = (kp.w) dt.h.b(wVar);
            return this;
        }

        public a p(kp.c0 c0Var) {
            this.f11525s = (kp.c0) dt.h.b(c0Var);
            return this;
        }

        public a q(c0 c0Var) {
            this.f11521o = (c0) dt.h.b(c0Var);
            return this;
        }

        public a r(TrackingEventsModule trackingEventsModule) {
            this.f11528v = (TrackingEventsModule) dt.h.b(trackingEventsModule);
            return this;
        }

        public a() {
        }
    }

    public static final class b implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11529a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public xn.g a(DocumentStepFragment documentStepFragment) {
            dt.h.b(documentStepFragment);
            return new c(this.f11529a, documentStepFragment);
        }

        public b(f fVar) {
            this.f11529a = fVar;
        }
    }

    public static final class c implements xn.g {

        /* renamed from: a, reason: collision with root package name */
        public final f f11530a;
        public final c b = this;

        /* renamed from: c, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.a> f11531c;

        /* renamed from: d, reason: collision with root package name */
        public dt.i<i.b> f11532d;

        /* renamed from: e, reason: collision with root package name */
        public dt.i<a.C0184a> f11533e;

        /* renamed from: f, reason: collision with root package name */
        public dt.i<e.a> f11534f;

        /* renamed from: g, reason: collision with root package name */
        public dt.i<c.a> f11535g;

        /* renamed from: h, reason: collision with root package name */
        public dt.i<a.C0697a> f11536h;

        /* renamed from: i, reason: collision with root package name */
        public dt.i<g.a> f11537i;

        /* renamed from: j, reason: collision with root package name */
        public rp.d f11538j;

        /* renamed from: k, reason: collision with root package name */
        public dt.i<e.a> f11539k;

        /* renamed from: l, reason: collision with root package name */
        public c1 f11540l;

        /* renamed from: m, reason: collision with root package name */
        public dt.i<b.c> f11541m;

        /* renamed from: n, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.document.step.e f11542n;

        /* renamed from: o, reason: collision with root package name */
        public dt.i<d.a> f11543o;

        public c(f fVar, DocumentStepFragment documentStepFragment) {
            this.f11530a = fVar;
            b(documentStepFragment);
        }

        public final void b(DocumentStepFragment documentStepFragment) {
            f fVar = this.f11530a;
            this.f11531c = xn.b.a(fVar.f11628t1, fVar.f11632v, fVar.f11587g);
            f fVar2 = this.f11530a;
            this.f11532d = com.withpersona.sdk2.inquiry.document.j.a(fVar2.f11625s1, fVar2.f11631u1, fVar2.f11632v, fVar2.f11587g);
            this.f11533e = com.withpersona.sdk2.inquiry.document.network.b.a(this.f11530a.f11634v1);
            this.f11534f = com.withpersona.sdk2.inquiry.document.network.f.a(this.f11530a.f11634v1);
            f fVar3 = this.f11530a;
            this.f11535g = com.withpersona.sdk2.inquiry.document.network.d.a(fVar3.f11634v1, fVar3.f11637w1);
            this.f11536h = zn.b.a(this.f11530a.f11634v1);
            f fVar4 = this.f11530a;
            this.f11537i = com.withpersona.sdk2.inquiry.document.network.h.a(fVar4.f11634v1, fVar4.C0, fVar4.f11580d1);
            rp.d a10 = rp.d.a(this.f11530a.Q0);
            this.f11538j = a10;
            dt.i<e.a> b = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(a10);
            this.f11539k = b;
            f fVar5 = this.f11530a;
            c1 a11 = c1.a(fVar5.f11621r0, fVar5.f11632v, this.f11531c, this.f11532d, this.f11533e, this.f11534f, this.f11535g, this.f11536h, this.f11537i, fVar5.f11595i1, fVar5.F0, fVar5.L, b, fVar5.E1);
            this.f11540l = a11;
            dt.i<b.c> b10 = com.withpersona.sdk2.inquiry.document.step.c.b(a11);
            this.f11541m = b10;
            com.withpersona.sdk2.inquiry.document.step.e a12 = com.withpersona.sdk2.inquiry.document.step.e.a(b10);
            this.f11542n = a12;
            this.f11543o = com.withpersona.sdk2.inquiry.document.step.f.b(a12);
        }

        @Override // bt.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(DocumentStepFragment documentStepFragment) {
            d(documentStepFragment);
        }

        public final DocumentStepFragment d(DocumentStepFragment documentStepFragment) {
            mq.b.a(documentStepFragment, this.f11530a.a());
            com.withpersona.sdk2.inquiry.document.step.a.b(documentStepFragment, this.f11543o.get());
            com.withpersona.sdk2.inquiry.document.step.a.a(documentStepFragment, this.f11530a.D0.get());
            return documentStepFragment;
        }
    }

    public static final class d implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11544a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public oo.p a(GovernmentIdStepFragment governmentIdStepFragment) {
            dt.h.b(governmentIdStepFragment);
            return new C0218e(this.f11544a, governmentIdStepFragment);
        }

        public d(f fVar) {
            this.f11544a = fVar;
        }
    }

    /* renamed from: com.withpersona.sdk2.inquiry.internal.e$e, reason: collision with other inner class name */
    public static final class C0218e implements oo.p {
        public dt.i<d.a> A;

        /* renamed from: a, reason: collision with root package name */
        public final f f11545a;
        public final C0218e b = this;

        /* renamed from: c, reason: collision with root package name */
        public no.d f11546c;

        /* renamed from: d, reason: collision with root package name */
        public dt.i<c.a> f11547d;

        /* renamed from: e, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f11548e;

        /* renamed from: f, reason: collision with root package name */
        public dn.t f11549f;

        /* renamed from: g, reason: collision with root package name */
        public dt.i<e.a> f11550g;

        /* renamed from: h, reason: collision with root package name */
        public fn.c0 f11551h;

        /* renamed from: i, reason: collision with root package name */
        public dt.i<b0.a> f11552i;

        /* renamed from: j, reason: collision with root package name */
        public fn.e f11553j;

        /* renamed from: k, reason: collision with root package name */
        public dt.i<c.a> f11554k;

        /* renamed from: l, reason: collision with root package name */
        public dt.i<v0> f11555l;

        /* renamed from: m, reason: collision with root package name */
        public dt.i<j1> f11556m;

        /* renamed from: n, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.governmentid.g f11557n;

        /* renamed from: o, reason: collision with root package name */
        public dt.i<GovernmentIdAnalyzeWorker.a> f11558o;

        /* renamed from: p, reason: collision with root package name */
        public mo.b f11559p;

        /* renamed from: q, reason: collision with root package name */
        public dt.i<GovernmentIdHintWorker.b> f11560q;

        /* renamed from: r, reason: collision with root package name */
        public dt.i<b.a> f11561r;

        /* renamed from: s, reason: collision with root package name */
        public rp.d f11562s;

        /* renamed from: t, reason: collision with root package name */
        public dt.i<e.a> f11563t;

        /* renamed from: u, reason: collision with root package name */
        public dt.i<m0> f11564u;

        /* renamed from: v, reason: collision with root package name */
        public dt.i<AutoClassifyWorker.b> f11565v;

        /* renamed from: w, reason: collision with root package name */
        public dt.i<po.i> f11566w;

        /* renamed from: x, reason: collision with root package name */
        public d1 f11567x;

        /* renamed from: y, reason: collision with root package name */
        public dt.i<b.c> f11568y;

        /* renamed from: z, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e f11569z;

        public C0218e(f fVar, GovernmentIdStepFragment governmentIdStepFragment) {
            this.f11545a = fVar;
            b(governmentIdStepFragment);
        }

        public final void b(GovernmentIdStepFragment governmentIdStepFragment) {
            f fVar = this.f11545a;
            no.d a10 = no.d.a(fVar.f11632v, fVar.f11577c1, fVar.f11580d1, fVar.C0, fVar.f11583e1, fVar.f11589g1, fVar.L);
            this.f11546c = a10;
            this.f11547d = no.e.b(a10);
            f fVar2 = this.f11545a;
            this.f11548e = go.e.a(fVar2.f11592h1, fVar2.f11632v, fVar2.f11587g);
            f fVar3 = this.f11545a;
            dn.t a11 = dn.t.a(fVar3.f11632v, fVar3.f11589g1, fVar3.f11587g);
            this.f11549f = a11;
            this.f11550g = com.withpersona.sdk2.camera.f.b(a11);
            f fVar4 = this.f11545a;
            fn.c0 a12 = fn.c0.a(fVar4.f11632v, fVar4.f11589g1, fVar4.f11587g, fVar4.R, fVar4.G, fVar4.L, fVar4.F0, fVar4.f11638x);
            this.f11551h = a12;
            dt.i<b0.a> b = d0.b(a12);
            this.f11552i = b;
            f fVar5 = this.f11545a;
            fn.e a13 = fn.e.a(b, fVar5.R, fVar5.H, fVar5.L);
            this.f11553j = a13;
            dt.i<c.a> b10 = fn.f.b(a13);
            this.f11554k = b10;
            f fVar6 = this.f11545a;
            this.f11555l = w0.a(fVar6.f11632v, this.f11550g, b10, fVar6.f11595i1, fVar6.L);
            f fVar7 = this.f11545a;
            this.f11556m = k1.a(fVar7.f11632v, this.f11550g, this.f11554k, fVar7.f11595i1, fVar7.L);
            f fVar8 = this.f11545a;
            com.withpersona.sdk2.inquiry.governmentid.g a14 = com.withpersona.sdk2.inquiry.governmentid.g.a(fVar8.f11632v, fVar8.f11584f, fVar8.f11587g);
            this.f11557n = a14;
            this.f11558o = com.withpersona.sdk2.inquiry.governmentid.h.b(a14);
            f fVar9 = this.f11545a;
            mo.b a15 = mo.b.a(fVar9.f11632v, fVar9.f11584f);
            this.f11559p = a15;
            this.f11560q = mo.c.b(a15);
            this.f11561r = rr.c.a(this.f11545a.f11604l1);
            rp.d a16 = rp.d.a(this.f11545a.Q0);
            this.f11562s = a16;
            dt.i<e.a> b11 = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(a16);
            this.f11563t = b11;
            f fVar10 = this.f11545a;
            this.f11564u = n0.a(fVar10.f11632v, this.f11558o, this.f11560q, this.f11561r, this.f11550g, this.f11554k, fVar10.f11595i1, fVar10.L, b11);
            f fVar11 = this.f11545a;
            this.f11565v = com.withpersona.sdk2.inquiry.governmentid.network.a.a(fVar11.f11577c1, fVar11.f11583e1);
            po.k a17 = po.k.a(this.f11545a.f11595i1);
            this.f11566w = a17;
            f fVar12 = this.f11545a;
            d1 a18 = d1.a(fVar12.f11632v, fVar12.f11621r0, this.f11547d, this.f11548e, this.f11555l, this.f11556m, this.f11564u, this.f11565v, a17, fVar12.f11589g1, fVar12.f11595i1, fVar12.F0, fVar12.L, fVar12.f11572a1, fVar12.E1);
            this.f11567x = a18;
            dt.i<b.c> b12 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.c.b(a18);
            this.f11568y = b12;
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e a19 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.e.a(b12);
            this.f11569z = a19;
            this.A = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.f.b(a19);
        }

        @Override // bt.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(GovernmentIdStepFragment governmentIdStepFragment) {
            d(governmentIdStepFragment);
        }

        public final GovernmentIdStepFragment d(GovernmentIdStepFragment governmentIdStepFragment) {
            mq.b.a(governmentIdStepFragment, this.f11545a.a());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.f(governmentIdStepFragment, this.A.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.a(governmentIdStepFragment, this.f11545a.l());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.c(governmentIdStepFragment, dt.c.b(this.f11545a.f11584f));
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.e(governmentIdStepFragment, this.f11545a.L.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.b(governmentIdStepFragment, this.f11545a.f11638x.get());
            com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a.d(governmentIdStepFragment, this.f11545a.D0.get());
            return governmentIdStepFragment;
        }
    }

    public static final class f implements xo.s {
        public dt.i<Set<JsonAdapterBinding<?>>> A;
        public dt.i<xo.h> A0;
        public dt.i<wn.b0> A1;
        public dt.i<Set<h.e>> B;
        public dt.i<bp.i> B0;
        public dt.i<wn.m> B1;
        public dt.i<Set<h.e>> C;
        public dt.i<co.a> C0;
        public dt.i<wn.t> C1;
        public dt.i<sm.w> D;
        public dt.i<tq.a> D0;
        public dt.i<wn.d> D1;
        public dt.i<TrackingMetadataProvider> E;
        public dt.i<nq.e> E0;
        public dt.i<p0> E1;
        public dt.i<l0> F;
        public dt.i<nq.c> F0;
        public dt.i<jq.a> G;
        public dt.i<Application> G0;
        public dt.i<p0> H;
        public dt.i<RealFontDownloader> H0;
        public dt.i<NetworkStateManager> I;
        public dt.i<p.a> I0;
        public C0704RealTrackingEventsLogger_Factory J;
        public dt.i<c.a> J0;
        public dt.i<RealTrackingEventsLogger.Factory> K;
        public dt.i<c0.a> K0;
        public dt.i<TrackingEventsLogger> L;
        public dt.i<g.a> L0;
        public dt.i<z> M;
        public dt.i<l1.a> M0;
        public dt.i<Set<a0<?>>> N;
        public dt.i<g.a> N0;
        public dt.i<r0> O;
        public dt.i<c.a> O0;
        public dt.i<mu.b0<in.c>> P;
        public dt.i<d.a> P0;
        public dt.i<dn.n0> Q;
        public dt.i<com.withpersona.sdk2.inquiry.permissions.permissionRequest.g> Q0;
        public dt.i<i0> R;
        public dt.i<UploadService> R0;
        public dt.i<com.withpersona.sdk2.inquiry.selfie.d> S;
        public dt.i<DirectFileUploader> S0;
        public dt.i<xp.p0> T;
        public dt.i<y> T0;
        public dt.i<Set<a0<?>>> U;
        public dt.i<wn.p> U0;
        public dt.i<Set<a0<?>>> V;
        public dt.i<wn.a> V0;
        public dt.i<ym.c0> W;
        public dt.i<cp.d> W0;
        public dt.i<String> X;
        public dt.i<cp.a> X0;
        public dt.i<Interceptor> Y;
        public dt.i<Boolean> Y0;
        public dt.i<Interceptor> Z;
        public dt.i<com.withpersona.sdk2.inquiry.internal.network.e> Z0;

        /* renamed from: a, reason: collision with root package name */
        public final xo.n f11570a;

        /* renamed from: a0, reason: collision with root package name */
        public dt.i<up.c> f11571a0;

        /* renamed from: a1, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f11572a1;
        public final jq.c b;

        /* renamed from: b0, reason: collision with root package name */
        public dt.i<Interceptor> f11573b0;

        /* renamed from: b1, reason: collision with root package name */
        public dt.i<UiStepSavedStateHelper> f11574b1;

        /* renamed from: c, reason: collision with root package name */
        public final oq.a f11575c;

        /* renamed from: c0, reason: collision with root package name */
        public dt.i<Set<Interceptor>> f11576c0;

        /* renamed from: c1, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.network.b> f11577c1;

        /* renamed from: d, reason: collision with root package name */
        public final f f11578d = this;

        /* renamed from: d0, reason: collision with root package name */
        public dt.i<String> f11579d0;

        /* renamed from: d1, reason: collision with root package name */
        public dt.i<kq.a> f11580d1;

        /* renamed from: e, reason: collision with root package name */
        public dt.i<mu.b0<gt.n<j0>>> f11581e;

        /* renamed from: e0, reason: collision with root package name */
        public dt.i<String> f11582e0;

        /* renamed from: e1, reason: collision with root package name */
        public dt.i<pq.a> f11583e1;

        /* renamed from: f, reason: collision with root package name */
        public dt.i<x> f11584f;

        /* renamed from: f0, reason: collision with root package name */
        public dt.i<Map<String, String>> f11585f0;

        /* renamed from: f1, reason: collision with root package name */
        public dt.i<jn.b> f11586f1;

        /* renamed from: g, reason: collision with root package name */
        public dt.i<oq.c> f11587g;

        /* renamed from: g0, reason: collision with root package name */
        public dt.i<wn.z> f11588g0;

        /* renamed from: g1, reason: collision with root package name */
        public dt.i<jn.a> f11589g1;

        /* renamed from: h, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.camera.b> f11590h;

        /* renamed from: h0, reason: collision with root package name */
        public dt.i<wn.k> f11591h0;

        /* renamed from: h1, reason: collision with root package name */
        public dt.i<g.c<String[]>> f11592h1;

        /* renamed from: i, reason: collision with root package name */
        public dt.i<eo.d> f11593i;

        /* renamed from: i0, reason: collision with root package name */
        public dt.i<wn.r> f11594i0;

        /* renamed from: i1, reason: collision with root package name */
        public dt.i<sq.a> f11595i1;

        /* renamed from: j, reason: collision with root package name */
        public dt.i<eo.d> f11596j;

        /* renamed from: j0, reason: collision with root package name */
        public dt.i<wn.b> f11597j0;

        /* renamed from: j1, reason: collision with root package name */
        public dt.i<g.c<String>> f11598j1;

        /* renamed from: k, reason: collision with root package name */
        public dt.i<eo.d> f11599k;

        /* renamed from: k0, reason: collision with root package name */
        public dt.i<lp.b> f11600k0;

        /* renamed from: k1, reason: collision with root package name */
        public dt.i<g.c<IntentSenderRequest>> f11601k1;

        /* renamed from: l, reason: collision with root package name */
        public dt.i<eo.d> f11602l;

        /* renamed from: l0, reason: collision with root package name */
        public lp.f f11603l0;

        /* renamed from: l1, reason: collision with root package name */
        public dt.i<rr.a> f11604l1;

        /* renamed from: m, reason: collision with root package name */
        public dt.i<eo.d> f11605m;

        /* renamed from: m0, reason: collision with root package name */
        public dt.i<e.a> f11606m0;

        /* renamed from: m1, reason: collision with root package name */
        public dt.i<aq.a> f11607m1;

        /* renamed from: n, reason: collision with root package name */
        public dt.i<eo.d> f11608n;

        /* renamed from: n0, reason: collision with root package name */
        public dt.i<OkHttpClient> f11609n0;

        /* renamed from: n1, reason: collision with root package name */
        public dt.i<l0> f11610n1;

        /* renamed from: o, reason: collision with root package name */
        public dt.i<eo.d> f11611o;

        /* renamed from: o0, reason: collision with root package name */
        public dt.i<iv.y> f11612o0;

        /* renamed from: o1, reason: collision with root package name */
        public dt.i<g.c<PassportNfcReaderConfig>> f11613o1;

        /* renamed from: p, reason: collision with root package name */
        public dt.i<eo.d> f11614p;

        /* renamed from: p0, reason: collision with root package name */
        public dt.i<ep.w> f11615p0;

        /* renamed from: p1, reason: collision with root package name */
        public dt.i<g.c<JpMyNumberNfcReaderConfig>> f11616p1;

        /* renamed from: q, reason: collision with root package name */
        public dt.i<eo.d> f11617q;

        /* renamed from: q0, reason: collision with root package name */
        public dt.i<xo.i> f11618q0;

        /* renamed from: q1, reason: collision with root package name */
        public dt.i<or.c> f11619q1;

        /* renamed from: r, reason: collision with root package name */
        public dt.i<eo.d> f11620r;

        /* renamed from: r0, reason: collision with root package name */
        public dt.i<k6.s> f11621r0;

        /* renamed from: r1, reason: collision with root package name */
        public dt.i<g.c<kp.b>> f11622r1;

        /* renamed from: s, reason: collision with root package name */
        public dt.i<eo.d> f11623s;

        /* renamed from: s0, reason: collision with root package name */
        public dt.i<FallbackMode> f11624s0;

        /* renamed from: s1, reason: collision with root package name */
        public dt.i<g.c<String[]>> f11625s1;

        /* renamed from: t, reason: collision with root package name */
        public dt.i<eo.d> f11626t;

        /* renamed from: t0, reason: collision with root package name */
        public dt.i<FallbackModeService> f11627t0;

        /* renamed from: t1, reason: collision with root package name */
        public dt.i<g.c<Uri>> f11628t1;

        /* renamed from: u, reason: collision with root package name */
        public dt.i<Set<eo.d>> f11629u;

        /* renamed from: u0, reason: collision with root package name */
        public bp.k f11630u0;

        /* renamed from: u1, reason: collision with root package name */
        public dt.i<g.c<g.h>> f11631u1;

        /* renamed from: v, reason: collision with root package name */
        public dt.i<Context> f11632v;

        /* renamed from: v0, reason: collision with root package name */
        public dt.i<i.a> f11633v0;

        /* renamed from: v1, reason: collision with root package name */
        public dt.i<zn.c> f11634v1;

        /* renamed from: w, reason: collision with root package name */
        public dt.i<android.view.l0> f11635w;

        /* renamed from: w0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.fallbackmode.d> f11636w0;

        /* renamed from: w1, reason: collision with root package name */
        public dt.i<hq.k> f11637w1;

        /* renamed from: x, reason: collision with root package name */
        public dt.i<eo.e> f11638x;

        /* renamed from: x0, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.fallbackmode.g f11639x0;

        /* renamed from: x1, reason: collision with root package name */
        public dt.i<fo.a> f11640x1;

        /* renamed from: y, reason: collision with root package name */
        public dt.i<TrackingEventsCache> f11641y;

        /* renamed from: y0, reason: collision with root package name */
        public dt.i<f.a> f11642y0;

        /* renamed from: y1, reason: collision with root package name */
        public dt.i<k0> f11643y1;

        /* renamed from: z, reason: collision with root package name */
        public dt.i<Set<Object>> f11644z;

        /* renamed from: z0, reason: collision with root package name */
        public dt.i<bp.a> f11645z0;

        /* renamed from: z1, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.internal.q> f11646z1;

        public class a implements dt.i<p.a> {
            public a() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p.a get() {
                return new d(f.this.f11578d);
            }
        }

        public class b implements dt.i<c.a> {
            public b() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c.a get() {
                return new q(f.this.f11578d);
            }
        }

        public class c implements dt.i<c0.a> {
            public c() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c0.a get() {
                return new o(f.this.f11578d);
            }
        }

        public class d implements dt.i<g.a> {
            public d() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g.a get() {
                return new b(f.this.f11578d);
            }
        }

        /* renamed from: com.withpersona.sdk2.inquiry.internal.e$f$e, reason: collision with other inner class name */
        public class C0219e implements dt.i<l1.a> {
            public C0219e() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l1.a get() {
                return new m(f.this.f11578d);
            }
        }

        /* renamed from: com.withpersona.sdk2.inquiry.internal.e$f$f, reason: collision with other inner class name */
        public class C0220f implements dt.i<g.a> {
            public C0220f() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g.a get() {
                return new k(f.this.f11578d);
            }
        }

        public class g implements dt.i<c.a> {
            public g() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c.a get() {
                return new s(f.this.f11578d);
            }
        }

        public class h implements dt.i<d.a> {
            public h() {
            }

            @Override // ft.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d.a get() {
                return new i(f.this.f11578d);
            }
        }

        public f(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11570a = nVar;
            this.b = cVar3;
            this.f11575c = aVar;
            m(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            n(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            o(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            p(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            q(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            r(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
        }

        public dt.j<a0<?>> A(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            j.b a10 = dt.j.a(0, 8);
            a10.a(ep.o.a());
            a10.a(this.N);
            a10.a(c2.a());
            a10.a(this.U);
            a10.a(xn.h.a());
            a10.a(up.h.a());
            a10.a(mp.f.a());
            a10.a(m1.a());
            return a10.c();
        }

        public k0 B() {
            return new k0(xo.p.a(this.f11570a), new a.C0662a(), this.f11615p0.get());
        }

        @Override // xo.s
        public bt.b<Object> a() {
            return bt.c.a(s(), Collections.EMPTY_MAP);
        }

        @Override // xo.s
        public TrackingEventsLogger b() {
            return this.L.get();
        }

        @Override // xo.s
        public wn.k c() {
            return this.f11591h0.get();
        }

        @Override // xo.s
        public xo.i d() {
            return this.f11618q0.get();
        }

        @Override // xo.s
        public k6.s e() {
            return this.f11621r0.get();
        }

        @Override // xo.s
        public a.InterfaceC0227a f() {
            return new g(this.f11578d);
        }

        @Override // xo.s
        public DirectFileUploader g() {
            return this.S0.get();
        }

        @Override // xo.s
        public ir.a h() {
            return this.H0.get();
        }

        @Override // xo.s
        public com.withpersona.sdk2.inquiry.permissions.permissionRequest.g i() {
            return this.Q0.get();
        }

        @Override // xo.s
        public com.withpersona.sdk2.inquiry.internal.q j() {
            return new com.withpersona.sdk2.inquiry.internal.q(B(), jq.f.c(this.b));
        }

        public com.withpersona.sdk2.camera.b l() {
            return new com.withpersona.sdk2.camera.b(oq.b.c(this.f11575c));
        }

        public final void m(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.i<mu.b0<gt.n<j0>>> c10 = dt.c.c(dn.m.a(kVar));
            this.f11581e = c10;
            this.f11584f = dn.y.a(c10);
            oq.b a10 = oq.b.a(aVar);
            this.f11587g = a10;
            this.f11590h = dn.q.a(a10);
            this.f11593i = eo.o.a(gVar);
            this.f11596j = eo.q.a(gVar);
            this.f11599k = eo.p.a(gVar);
            this.f11602l = eo.k.a(gVar);
            this.f11605m = eo.r.a(gVar);
            this.f11608n = eo.j.a(gVar);
            this.f11611o = eo.n.a(gVar);
            this.f11614p = eo.h.b(gVar);
            this.f11617q = eo.i.a(gVar);
            this.f11620r = eo.s.a(gVar);
            this.f11623s = eo.m.a(gVar);
            this.f11626t = eo.l.a(gVar);
            this.f11629u = v(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.f11632v = xo.p.b(nVar);
            bp.g a11 = bp.g.a(cVar2);
            this.f11635w = a11;
            this.f11638x = dt.c.c(eo.f.a(this.f11629u, this.f11632v, a11));
            this.f11641y = dt.c.c(TrackingEventsCache_Factory.create());
            this.f11644z = z(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.A = x(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.B = TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory.create(trackingEventsModule);
            this.C = y(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
        }

        public final void n(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.D = dt.c.c(NetworkCoreModule_MoshiFactory.create(networkCoreModule, this.f11644z, this.A, this.C));
            this.E = dt.c.c(TrackingMetadataProvider_Factory.create(this.f11632v));
            jq.e a10 = jq.e.a(cVar3);
            this.F = a10;
            dt.i<jq.a> c10 = dt.c.c(jq.b.a(a10));
            this.G = c10;
            this.H = jq.d.b(cVar3, c10);
            dt.i<NetworkStateManager> c11 = dt.c.c(NetworkStateManager_Factory.create());
            this.I = c11;
            C0704RealTrackingEventsLogger_Factory create = C0704RealTrackingEventsLogger_Factory.create(this.f11632v, this.f11641y, this.D, this.E, this.f11587g, this.f11638x, this.H, c11);
            this.J = create;
            dt.i<RealTrackingEventsLogger.Factory> createFactoryProvider = RealTrackingEventsLogger_Factory_Impl.createFactoryProvider(create);
            this.K = createFactoryProvider;
            dt.i<TrackingEventsLogger> c12 = dt.c.c(TrackingEventsModule_TrackingEventsLoggerFactory.create(trackingEventsModule, createFactoryProvider));
            this.L = c12;
            io.a0 a11 = io.a0.a(this.f11584f, this.f11590h, this.f11638x, c12);
            this.M = a11;
            this.N = go.m.a(a11);
            this.O = s0.a(this.f11638x);
            dt.i<mu.b0<in.c>> c13 = dt.c.c(dn.n.a(kVar));
            this.P = c13;
            this.Q = o0.a(this.O, c13);
            dt.i<i0> c14 = dt.c.c(fn.j0.a());
            this.R = c14;
            this.S = wp.n.a(this.f11590h, this.Q, c14, this.L);
            q0 a12 = q0.a(this.f11590h, this.Q, this.L, this.f11638x);
            this.T = a12;
            this.U = wp.b0.a(this.S, a12);
            dt.j<a0<?>> A = A(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.V = A;
            this.W = dt.c.c(ep.u.a(A));
            this.X = ep.r.a(fVar);
            this.Y = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule, this.I);
            this.Z = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, this.D);
            dt.i<up.c> c15 = dt.c.c(up.d.a());
            this.f11571a0 = c15;
            this.f11573b0 = up.g.a(fVar2, c15);
        }

        public final void o(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11576c0 = w(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            this.f11579d0 = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
            this.f11582e0 = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
            this.f11585f0 = u(networkCoreModule, fVar, qVar, kVar, wVar, aVar, nVar, dVar, iVar, fVar2, eVar, cVar, bVar, cVar2, c0Var, cVar3, aVar2, fVar3, c0Var2, eVar2, gVar, trackingEventsModule);
            wn.a0 a10 = wn.a0.a(this.f11632v);
            this.f11588g0 = a10;
            this.f11591h0 = dt.c.c(wn.f.b(eVar2, a10));
            wn.s a11 = wn.s.a(this.f11632v);
            this.f11594i0 = a11;
            this.f11597j0 = dt.c.c(wn.h.a(eVar2, a11));
            lp.d a12 = lp.d.a(this.f11632v);
            this.f11600k0 = a12;
            lp.f a13 = lp.f.a(a12);
            this.f11603l0 = a13;
            dt.i<e.a> a14 = lp.g.a(a13);
            this.f11606m0 = a14;
            NetworkCoreModule_OkhttpClientFactory create = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, this.f11576c0, this.f11585f0, this.f11632v, this.f11591h0, this.f11597j0, a14, this.I);
            this.f11609n0 = create;
            dt.i<iv.y> c10 = dt.c.c(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, this.X, create, this.D));
            this.f11612o0 = c10;
            dt.i<ep.w> c11 = dt.c.c(ep.j.a(fVar, c10));
            this.f11615p0 = c11;
            this.f11618q0 = dt.c.c(xo.j.a(c11, this.D, this.f11600k0, this.H));
            this.f11621r0 = dt.c.c(xo.q.a(nVar, this.f11632v));
            this.f11624s0 = bp.e.a(cVar2);
            this.f11627t0 = dt.c.c(ep.g.a(fVar, this.f11612o0));
            bp.k a15 = bp.k.a(this.f11635w);
            this.f11630u0 = a15;
            dt.i<i.a> b10 = com.withpersona.sdk2.inquiry.internal.fallbackmode.j.b(a15);
            this.f11633v0 = b10;
            this.f11636w0 = com.withpersona.sdk2.inquiry.internal.fallbackmode.e.a(this.f11627t0, this.D, b10);
            com.withpersona.sdk2.inquiry.internal.fallbackmode.g a16 = com.withpersona.sdk2.inquiry.internal.fallbackmode.g.a(this.D, this.f11632v, this.f11633v0);
            this.f11639x0 = a16;
            dt.i<f.a> b11 = com.withpersona.sdk2.inquiry.internal.fallbackmode.h.b(a16);
            this.f11642y0 = b11;
            this.f11645z0 = com.withpersona.sdk2.inquiry.internal.fallbackmode.b.b(aVar2, this.f11636w0, b11);
            this.A0 = bp.d.a(cVar2);
        }

        public final void p(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            dt.i<bp.i> c10 = dt.c.c(bp.j.a(this.f11624s0, this.f11645z0, this.A0, this.D));
            this.B0 = c10;
            this.C0 = dt.c.c(bp.f.a(cVar2, c10));
            this.D0 = dt.c.c(f0.a(c0Var));
            nq.g a10 = nq.g.a(fVar3);
            this.E0 = a10;
            this.F0 = dt.c.c(nq.d.a(a10, this.H));
            xo.o b10 = xo.o.b(nVar);
            this.G0 = b10;
            this.H0 = dt.c.c(ir.e.a(this.f11609n0, b10, this.H));
            this.I0 = new a();
            this.J0 = new b();
            this.K0 = new c();
            this.L0 = new d();
            this.M0 = new C0219e();
            this.N0 = new C0220f();
            this.O0 = new g();
            this.P0 = new h();
            this.Q0 = dt.c.c(rp.f.a());
            dt.i<UploadService> c11 = dt.c.c(ep.t.a(fVar, this.f11612o0));
            this.R0 = c11;
            this.S0 = dt.c.c(zp.a.a(this.f11635w, c11, this.H));
            this.T0 = dt.c.c(ep.p.a(fVar, this.f11612o0));
            wn.q a11 = wn.q.a(this.f11632v);
            this.U0 = a11;
            this.V0 = dt.c.c(wn.g.a(eVar2, a11));
            dt.i<cp.d> c12 = dt.c.c(cp.e.a());
            this.W0 = c12;
            this.X0 = dt.c.c(cp.c.a(this.f11632v, this.f11606m0, c12, this.F));
            ep.n a12 = ep.n.a(fVar);
            this.Y0 = a12;
            this.Z0 = dt.c.c(ep.d.a(this.f11632v, this.f11615p0, this.T0, this.B0, this.f11571a0, this.V0, this.X0, a12));
        }

        public final void q(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11572a1 = dt.c.c(qq.a.a(this.f11635w));
            this.f11574b1 = dt.c.c(xo.o0.a(this.f11632v, this.H));
            this.f11577c1 = dt.c.c(ep.i.a(fVar, this.f11612o0));
            this.f11580d1 = kq.c.a(bVar);
            this.f11583e1 = dt.c.c(e0.a(c0Var, pq.d.a()));
            dt.i<jn.b> c10 = dt.c.c(jn.c.a(this.f11632v));
            this.f11586f1 = c10;
            this.f11589g1 = dn.l.b(kVar, c10);
            this.f11592h1 = dt.c.c(kp.t.a(qVar));
            this.f11595i1 = dt.c.c(sq.b.a(this.E0, this.f11638x, this.H));
            this.f11598j1 = dt.c.c(kp.z.a(wVar));
            this.f11601k1 = dt.c.c(kp.f0.a(c0Var2));
            this.f11604l1 = dt.c.c(ep.v.a(fVar, this.f11612o0));
            this.f11607m1 = dt.c.c(ep.q.a(fVar, this.f11612o0));
            this.f11610n1 = jq.f.a(cVar3);
            this.f11613o1 = dt.c.c(op.h.a(eVar));
            this.f11616p1 = dt.c.c(jp.f.a(cVar));
            this.f11619q1 = dt.c.c(ep.s.a(fVar, this.f11612o0));
            this.f11622r1 = dt.c.c(kp.g.a(dVar));
            this.f11625s1 = dt.c.c(kp.n.a(iVar));
            this.f11628t1 = dt.c.c(kp.p.a(iVar));
            this.f11631u1 = dt.c.c(kp.o.a(iVar));
            this.f11634v1 = dt.c.c(ep.f.a(fVar, this.f11612o0));
            this.f11637w1 = dt.c.c(hq.d0.a(c0Var, hq.y.a()));
            this.f11640x1 = dt.c.c(ep.h.a(fVar, this.f11612o0));
            this.f11643y1 = xo.l0.a(this.f11632v, xq.b.a(), this.f11615p0);
        }

        public final void r(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            this.f11646z1 = xo.j0.a(this.f11643y1, this.f11610n1);
            wn.c0 a10 = wn.c0.a(this.f11632v);
            this.A1 = a10;
            dt.i<wn.m> c10 = dt.c.c(wn.j.a(eVar2, a10));
            this.B1 = c10;
            wn.u a11 = wn.u.a(this.f11632v, c10);
            this.C1 = a11;
            this.D1 = dt.c.c(wn.i.a(eVar2, a11));
            this.E1 = xo.r.a(nVar);
        }

        public Map<Class<?>, ft.a<a.InterfaceC0091a<?>>> s() {
            return t();
        }

        public Map t() {
            dt.f b10 = dt.f.b(8);
            b10.c(GovernmentIdStepFragment.class, this.I0);
            b10.c(UiStepFragment.class, this.J0);
            b10.c(SelfieStepFragment.class, this.K0);
            b10.c(DocumentStepFragment.class, this.L0);
            b10.c(PermissionRequestFragment.class, this.M0);
            b10.c(dp.f.class, this.N0);
            b10.c(hp.b.class, this.O0);
            b10.c(IntegrationStepFragment.class, this.P0);
            return b10.a();
        }

        public dt.g<String, String> u(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            g.b b10 = dt.g.b(3);
            b10.c("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
            b10.c("Key-Inflection", this.f11579d0);
            b10.c("Persona-Use-Mobile-Server-Styles", this.f11582e0);
            return b10.b();
        }

        public dt.j<eo.d> v(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            j.b a10 = dt.j.a(12, 0);
            a10.b(this.f11593i);
            a10.b(this.f11596j);
            a10.b(this.f11599k);
            a10.b(this.f11602l);
            a10.b(this.f11605m);
            a10.b(this.f11608n);
            a10.b(this.f11611o);
            a10.b(this.f11614p);
            a10.b(this.f11617q);
            a10.b(this.f11620r);
            a10.b(this.f11623s);
            a10.b(this.f11626t);
            return a10.c();
        }

        public dt.j<Interceptor> w(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            j.b a10 = dt.j.a(3, 0);
            a10.b(this.Y);
            a10.b(this.Z);
            a10.b(this.f11573b0);
            return a10.c();
        }

        public dt.j<JsonAdapterBinding<?>> x(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            j.b a10 = dt.j.a(0, 1);
            a10.a(ep.k.a());
            return a10.c();
        }

        public dt.j<h.e> y(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            j.b a10 = dt.j.a(0, 5);
            a10.a(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            a10.a(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
            a10.a(ep.m.a());
            a10.a(go.l.a());
            a10.a(this.B);
            return a10.c();
        }

        public dt.j<Object> z(NetworkCoreModule networkCoreModule, com.withpersona.sdk2.inquiry.internal.network.f fVar, kp.q qVar, dn.k kVar, kp.w wVar, oq.a aVar, xo.n nVar, kp.d dVar, kp.i iVar, up.f fVar2, op.e eVar, jp.c cVar, kq.b bVar, bp.c cVar2, hq.c0 c0Var, jq.c cVar3, com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar2, nq.f fVar3, kp.c0 c0Var2, wn.e eVar2, eo.g gVar, TrackingEventsModule trackingEventsModule) {
            j.b a10 = dt.j.a(0, 2);
            a10.a(ep.l.a());
            a10.a(b2.a());
            return a10.c();
        }
    }

    public static final class g implements a.InterfaceC0227a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11655a;

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.a.InterfaceC0227a
        public com.withpersona.sdk2.inquiry.internal.workflows.a a() {
            return new h(this.f11655a);
        }

        public g(f fVar) {
            this.f11655a = fVar;
        }
    }

    public static final class h implements com.withpersona.sdk2.inquiry.internal.workflows.a {
        public dt.i<c.a> A;
        public fo.c A0;
        public dt.i<so.j> B;
        public dt.i<b.a> B0;
        public dt.i<so.v> C;
        public dt.i<xo.f> C0;
        public dt.i<d.a> D;
        public fp.f0 D0;
        public pp.j E;
        public dt.i<e0.b> E0;
        public dt.i<a.InterfaceC0230a> F;
        public ip.c F0;
        public dt.i<DeviceFeatureRequestWorkflow> G;
        public dt.i<c.a> G0;
        public dt.i<PermissionRequestWorkflow> H;
        public ip.d H0;
        public com.withpersona.sdk2.inquiry.governmentid.g I;
        public dt.i<e.a> I0;
        public dt.i<GovernmentIdAnalyzeWorker.a> J;
        public mo.b K;
        public dt.i<GovernmentIdHintWorker.b> L;
        public dt.i<b.a> M;
        public dt.i<t0> N;
        public dt.i<AutoClassifyWorker.b> O;
        public dt.i<ho.n> P;
        public dt.i<GovernmentIdWorkflow> Q;
        public aq.c R;
        public dt.i<b.a> S;
        public wp.v T;
        public dt.i<e.b> U;
        public dt.i<fq.j> V;
        public bq.b W;
        public dt.i<a.b> X;
        public dt.i<com.withpersona.sdk2.inquiry.selfie.g> Y;
        public dt.i<SelfieWorkflow> Z;

        /* renamed from: a, reason: collision with root package name */
        public final f f11656a;

        /* renamed from: a0, reason: collision with root package name */
        public op.k f11657a0;
        public final h b = this;

        /* renamed from: b0, reason: collision with root package name */
        public dt.i<b.a> f11658b0;

        /* renamed from: c, reason: collision with root package name */
        public xo.d f11659c;

        /* renamed from: c0, reason: collision with root package name */
        public jp.o f11660c0;

        /* renamed from: d, reason: collision with root package name */
        public dt.i<c.a> f11661d;

        /* renamed from: d0, reason: collision with root package name */
        public dt.i<n.a> f11662d0;

        /* renamed from: e, reason: collision with root package name */
        public xo.c f11663e;

        /* renamed from: e0, reason: collision with root package name */
        public mr.l1 f11664e0;

        /* renamed from: f, reason: collision with root package name */
        public dt.i<a.InterfaceC0217a> f11665f;

        /* renamed from: f0, reason: collision with root package name */
        public dt.i<d.a> f11666f0;

        /* renamed from: g, reason: collision with root package name */
        public xo.c0 f11667g;

        /* renamed from: g0, reason: collision with root package name */
        public k6 f11668g0;

        /* renamed from: h, reason: collision with root package name */
        public dt.i<k.b> f11669h;

        /* renamed from: h0, reason: collision with root package name */
        public dt.i<k.a> f11670h0;

        /* renamed from: i, reason: collision with root package name */
        public xo.n0 f11671i;

        /* renamed from: i0, reason: collision with root package name */
        public dt.i<b.a> f11672i0;

        /* renamed from: j, reason: collision with root package name */
        public dt.i<r.a> f11673j;

        /* renamed from: j0, reason: collision with root package name */
        public dt.i<a.C0492a> f11674j0;

        /* renamed from: k, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.internal.t f11675k;

        /* renamed from: k0, reason: collision with root package name */
        public dt.i<h.a> f11676k0;

        /* renamed from: l, reason: collision with root package name */
        public dt.i<TransitionWorker.a> f11677l;

        /* renamed from: l0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.ui.a> f11678l0;

        /* renamed from: m, reason: collision with root package name */
        public xo.p0 f11679m;

        /* renamed from: m0, reason: collision with root package name */
        public dt.i<UiWorkflow> f11680m0;

        /* renamed from: n, reason: collision with root package name */
        public dt.i<v.a> f11681n;

        /* renamed from: n0, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.document.a> f11682n0;

        /* renamed from: o, reason: collision with root package name */
        public xo.k f11683o;

        /* renamed from: o0, reason: collision with root package name */
        public dt.i<i.b> f11684o0;

        /* renamed from: p, reason: collision with root package name */
        public dt.i<f.a> f11685p;

        /* renamed from: p0, reason: collision with root package name */
        public dt.i<a.C0184a> f11686p0;

        /* renamed from: q, reason: collision with root package name */
        public h0 f11687q;

        /* renamed from: q0, reason: collision with root package name */
        public dt.i<e.a> f11688q0;

        /* renamed from: r, reason: collision with root package name */
        public dt.i<m.a> f11689r;

        /* renamed from: r0, reason: collision with root package name */
        public dt.i<c.a> f11690r0;

        /* renamed from: s, reason: collision with root package name */
        public no.d f11691s;

        /* renamed from: s0, reason: collision with root package name */
        public dt.i<a.C0697a> f11692s0;

        /* renamed from: t, reason: collision with root package name */
        public dt.i<c.a> f11693t;

        /* renamed from: t0, reason: collision with root package name */
        public dt.i<g.a> f11694t0;

        /* renamed from: u, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f11695u;

        /* renamed from: u0, reason: collision with root package name */
        public dt.i<DocumentWorkflow> f11696u0;

        /* renamed from: v, reason: collision with root package name */
        public dn.t f11697v;

        /* renamed from: v0, reason: collision with root package name */
        public vo.c f11698v0;

        /* renamed from: w, reason: collision with root package name */
        public dt.i<e.a> f11699w;

        /* renamed from: w0, reason: collision with root package name */
        public dt.i<a.InterfaceC0209a> f11700w0;

        /* renamed from: x, reason: collision with root package name */
        public fn.c0 f11701x;

        /* renamed from: x0, reason: collision with root package name */
        public dt.i<IntegrationWorkflow> f11702x0;

        /* renamed from: y, reason: collision with root package name */
        public dt.i<b0.a> f11703y;

        /* renamed from: y0, reason: collision with root package name */
        public xo.i0 f11704y0;

        /* renamed from: z, reason: collision with root package name */
        public fn.e f11705z;

        /* renamed from: z0, reason: collision with root package name */
        public dt.i<o.a> f11706z0;

        public h(f fVar) {
            this.f11656a = fVar;
            b();
            c();
            d();
            e();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.workflows.a
        public void a(InquiryWorkflowFragment inquiryWorkflowFragment) {
            f(inquiryWorkflowFragment);
        }

        public final void b() {
            xo.d a10 = xo.d.a(this.f11656a.Z0);
            this.f11659c = a10;
            this.f11661d = com.withpersona.sdk2.inquiry.internal.d.b(a10);
            xo.c a11 = xo.c.a(this.f11656a.Z0);
            this.f11663e = a11;
            this.f11665f = com.withpersona.sdk2.inquiry.internal.b.b(a11);
            f fVar = this.f11656a;
            xo.c0 a12 = xo.c0.a(fVar.f11615p0, fVar.V0, fVar.f11571a0, fVar.B0, fVar.H0, fVar.f11572a1, fVar.Z0);
            this.f11667g = a12;
            this.f11669h = com.withpersona.sdk2.inquiry.internal.l.b(a12);
            xo.n0 a13 = xo.n0.a(this.f11656a.Z0);
            this.f11671i = a13;
            this.f11673j = com.withpersona.sdk2.inquiry.internal.s.b(a13);
            f fVar2 = this.f11656a;
            com.withpersona.sdk2.inquiry.internal.t a14 = com.withpersona.sdk2.inquiry.internal.t.a(fVar2.f11615p0, fVar2.C0, fVar2.f11574b1, fVar2.f11638x, fVar2.f11632v);
            this.f11675k = a14;
            this.f11677l = u.b(a14);
            xo.p0 a15 = xo.p0.a(this.f11656a.Z0);
            this.f11679m = a15;
            this.f11681n = w.b(a15);
            xo.k a16 = xo.k.a(this.f11656a.Z0);
            this.f11683o = a16;
            this.f11685p = com.withpersona.sdk2.inquiry.internal.g.a(a16);
            h0 a17 = h0.a(this.f11656a.Z0);
            this.f11687q = a17;
            this.f11689r = com.withpersona.sdk2.inquiry.internal.n.a(a17);
            f fVar3 = this.f11656a;
            no.d a18 = no.d.a(fVar3.f11632v, fVar3.f11577c1, fVar3.f11580d1, fVar3.C0, fVar3.f11583e1, fVar3.f11589g1, fVar3.L);
            this.f11691s = a18;
            this.f11693t = no.e.b(a18);
            f fVar4 = this.f11656a;
            this.f11695u = go.e.a(fVar4.f11592h1, fVar4.f11632v, fVar4.f11587g);
            f fVar5 = this.f11656a;
            dn.t a19 = dn.t.a(fVar5.f11632v, fVar5.f11589g1, fVar5.f11587g);
            this.f11697v = a19;
            this.f11699w = com.withpersona.sdk2.camera.f.b(a19);
            f fVar6 = this.f11656a;
            fn.c0 a20 = fn.c0.a(fVar6.f11632v, fVar6.f11589g1, fVar6.f11587g, fVar6.R, fVar6.G, fVar6.L, fVar6.F0, fVar6.f11638x);
            this.f11701x = a20;
            dt.i<b0.a> b = d0.b(a20);
            this.f11703y = b;
            f fVar7 = this.f11656a;
            fn.e a21 = fn.e.a(b, fVar7.R, fVar7.H, fVar7.L);
            this.f11705z = a21;
            this.A = fn.f.b(a21);
        }

        public final void c() {
            f fVar = this.f11656a;
            this.B = so.k.a(fVar.f11632v, this.f11699w, this.A, fVar.f11595i1);
            f fVar2 = this.f11656a;
            this.C = so.w.a(fVar2.f11632v, this.f11699w, this.A, fVar2.f11595i1, fVar2.L);
            f fVar3 = this.f11656a;
            this.D = com.withpersona.sdk2.inquiry.permissions.e.a(fVar3.f11632v, fVar3.f11598j1, fVar3.L);
            f fVar4 = this.f11656a;
            pp.j a10 = pp.j.a(fVar4.f11601k1, fVar4.f11632v);
            this.E = a10;
            dt.i<a.InterfaceC0230a> b = com.withpersona.sdk2.inquiry.permissions.b.b(a10);
            this.F = b;
            com.withpersona.sdk2.inquiry.permissions.c a11 = com.withpersona.sdk2.inquiry.permissions.c.a(this.f11656a.f11632v, b);
            this.G = a11;
            f fVar5 = this.f11656a;
            this.H = com.withpersona.sdk2.inquiry.permissions.f.a(fVar5.f11632v, this.D, a11, fVar5.L);
            f fVar6 = this.f11656a;
            com.withpersona.sdk2.inquiry.governmentid.g a12 = com.withpersona.sdk2.inquiry.governmentid.g.a(fVar6.f11632v, fVar6.f11584f, fVar6.f11587g);
            this.I = a12;
            this.J = com.withpersona.sdk2.inquiry.governmentid.h.b(a12);
            f fVar7 = this.f11656a;
            mo.b a13 = mo.b.a(fVar7.f11632v, fVar7.f11584f);
            this.K = a13;
            this.L = mo.c.b(a13);
            rr.c a14 = rr.c.a(this.f11656a.f11604l1);
            this.M = a14;
            f fVar8 = this.f11656a;
            this.N = u0.a(fVar8.f11632v, this.H, this.J, this.L, a14, this.f11699w, this.A, fVar8.f11595i1, fVar8.L);
            f fVar9 = this.f11656a;
            this.O = com.withpersona.sdk2.inquiry.governmentid.network.a.a(fVar9.f11577c1, fVar9.f11583e1);
            ho.p a15 = ho.p.a(this.f11656a.f11595i1);
            this.P = a15;
            f fVar10 = this.f11656a;
            this.Q = h2.a(fVar10.f11632v, fVar10.f11621r0, this.f11693t, this.f11695u, this.B, this.C, this.N, this.O, a15, fVar10.f11589g1, fVar10.f11595i1, fVar10.F0, fVar10.L, fVar10.f11572a1);
            f fVar11 = this.f11656a;
            aq.c a16 = aq.c.a(fVar11.f11632v, fVar11.f11607m1, fVar11.f11580d1, fVar11.C0, fVar11.f11583e1, fVar11.f11589g1, fVar11.L, fVar11.S0);
            this.R = a16;
            this.S = aq.d.b(a16);
            f fVar12 = this.f11656a;
            wp.v a17 = wp.v.a(fVar12.Q, fVar12.f11587g);
            this.T = a17;
            this.U = com.withpersona.sdk2.inquiry.selfie.f.b(a17);
            f fVar13 = this.f11656a;
            this.V = fq.k.a(fVar13.f11632v, this.f11699w, this.A, fVar13.f11595i1, fVar13.f11638x);
            f fVar14 = this.f11656a;
            bq.b a18 = bq.b.a(fVar14.f11635w, fVar14.f11607m1, fVar14.H, fVar14.f11610n1);
            this.W = a18;
            this.X = bq.c.b(a18);
            f fVar15 = this.f11656a;
            wp.w a19 = wp.w.a(fVar15.F0, fVar15.L);
            this.Y = a19;
            f fVar16 = this.f11656a;
            this.Z = com.withpersona.sdk2.inquiry.selfie.q.a(fVar16.f11632v, this.S, this.M, this.U, this.H, this.V, this.f11699w, this.A, fVar16.f11589g1, fVar16.f11595i1, fVar16.S0, this.X, fVar16.f11572a1, a19, fVar16.f11587g, fVar16.f11638x);
        }

        public final void d() {
            f fVar = this.f11656a;
            op.k a10 = op.k.a(fVar.f11613o1, fVar.f11632v, fVar.f11571a0, fVar.f11587g, fVar.f11638x);
            this.f11657a0 = a10;
            this.f11658b0 = com.withpersona.sdk2.inquiry.nfc.c.b(a10);
            f fVar2 = this.f11656a;
            jp.o a11 = jp.o.a(fVar2.f11616p1, fVar2.f11632v, fVar2.f11571a0);
            this.f11660c0 = a11;
            this.f11662d0 = jp.p.b(a11);
            f fVar3 = this.f11656a;
            mr.l1 a12 = mr.l1.a(fVar3.f11619q1, fVar3.V0, fVar3.f11622r1);
            this.f11664e0 = a12;
            this.f11666f0 = com.withpersona.sdk2.inquiry.ui.e.b(a12);
            f fVar4 = this.f11656a;
            k6 a13 = k6.a(fVar4.f11622r1, fVar4.f11619q1, fVar4.D);
            this.f11668g0 = a13;
            this.f11670h0 = com.withpersona.sdk2.inquiry.ui.l.b(a13);
            this.f11672i0 = com.withpersona.sdk2.inquiry.ui.network.c.a(this.f11656a.f11619q1);
            this.f11674j0 = or.b.a(this.f11656a.f11619q1);
            f fVar5 = this.f11656a;
            this.f11676k0 = com.withpersona.sdk2.inquiry.ui.i.a(fVar5.f11625s1, fVar5.f11592h1, fVar5.f11632v);
            com.withpersona.sdk2.inquiry.ui.c a14 = com.withpersona.sdk2.inquiry.ui.c.a(this.f11656a.f11632v, this.f11672i0, this.f11674j0, xq.b.a(), this.f11676k0);
            this.f11678l0 = a14;
            f fVar6 = this.f11656a;
            this.f11680m0 = com.withpersona.sdk2.inquiry.ui.j.a(fVar6.f11632v, this.f11658b0, this.f11662d0, fVar6.f11571a0, this.f11666f0, this.f11670h0, fVar6.f11595i1, this.H, a14, fVar6.F0, fVar6.f11638x, fVar6.L);
            f fVar7 = this.f11656a;
            this.f11682n0 = xn.b.a(fVar7.f11628t1, fVar7.f11632v, fVar7.f11587g);
            f fVar8 = this.f11656a;
            this.f11684o0 = com.withpersona.sdk2.inquiry.document.j.a(fVar8.f11625s1, fVar8.f11631u1, fVar8.f11632v, fVar8.f11587g);
            this.f11686p0 = com.withpersona.sdk2.inquiry.document.network.b.a(this.f11656a.f11634v1);
            this.f11688q0 = com.withpersona.sdk2.inquiry.document.network.f.a(this.f11656a.f11634v1);
            f fVar9 = this.f11656a;
            this.f11690r0 = com.withpersona.sdk2.inquiry.document.network.d.a(fVar9.f11634v1, fVar9.f11637w1);
            this.f11692s0 = zn.b.a(this.f11656a.f11634v1);
            f fVar10 = this.f11656a;
            com.withpersona.sdk2.inquiry.document.network.h a15 = com.withpersona.sdk2.inquiry.document.network.h.a(fVar10.f11634v1, fVar10.C0, fVar10.f11580d1);
            this.f11694t0 = a15;
            f fVar11 = this.f11656a;
            this.f11696u0 = com.withpersona.sdk2.inquiry.document.h.a(fVar11.f11621r0, fVar11.f11632v, this.H, this.f11682n0, this.f11684o0, this.f11686p0, this.f11688q0, this.f11690r0, this.f11692s0, a15, fVar11.f11595i1, fVar11.F0, fVar11.L);
            f fVar12 = this.f11656a;
            vo.c a16 = vo.c.a(fVar12.f11632v, fVar12.f11622r1);
            this.f11698v0 = a16;
            dt.i<a.InterfaceC0209a> b = com.withpersona.sdk2.inquiry.integration.b.b(a16);
            this.f11700w0 = b;
            f fVar13 = this.f11656a;
            this.f11702x0 = com.withpersona.sdk2.inquiry.integration.c.a(fVar13.f11632v, fVar13.f11595i1, b, fVar13.L);
            this.f11704y0 = xo.i0.a(this.f11656a.f11574b1);
        }

        public final void e() {
            this.f11706z0 = com.withpersona.sdk2.inquiry.internal.p.b(this.f11704y0);
            f fVar = this.f11656a;
            fo.c a10 = fo.c.a(fVar.f11638x, fVar.f11640x1);
            this.A0 = a10;
            this.B0 = fo.d.a(a10);
            f fVar2 = this.f11656a;
            xo.g a11 = xo.g.a(fVar2.D1, fVar2.Z0, fVar2.f11610n1);
            this.C0 = a11;
            dt.i<c.a> iVar = this.f11661d;
            dt.i<a.InterfaceC0217a> iVar2 = this.f11665f;
            dt.i<k.b> iVar3 = this.f11669h;
            dt.i<r.a> iVar4 = this.f11673j;
            dt.i<TransitionWorker.a> iVar5 = this.f11677l;
            dt.i<v.a> iVar6 = this.f11681n;
            dt.i<f.a> iVar7 = this.f11685p;
            dt.i<m.a> iVar8 = this.f11689r;
            dt.i<GovernmentIdWorkflow> iVar9 = this.Q;
            dt.i<SelfieWorkflow> iVar10 = this.Z;
            dt.i<UiWorkflow> iVar11 = this.f11680m0;
            dt.i<DocumentWorkflow> iVar12 = this.f11696u0;
            dt.i<IntegrationWorkflow> iVar13 = this.f11702x0;
            f fVar3 = this.f11656a;
            fp.f0 a12 = fp.f0.a(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, fVar3.E0, fVar3.f11595i1, fVar3.F0, fVar3.f11574b1, this.f11706z0, this.B0, fVar3.f11638x, fVar3.L, fVar3.E, fVar3.f11646z1, a11, fVar3.E1);
            this.D0 = a12;
            dt.i<e0.b> b = g0.b(a12);
            this.E0 = b;
            ip.c a13 = ip.c.a(b);
            this.F0 = a13;
            this.G0 = com.withpersona.sdk2.inquiry.internal.workflows.d.b(a13);
            ip.d a14 = ip.d.a();
            this.H0 = a14;
            this.I0 = com.withpersona.sdk2.inquiry.internal.workflows.f.b(a14);
        }

        public final InquiryWorkflowFragment f(InquiryWorkflowFragment inquiryWorkflowFragment) {
            com.withpersona.sdk2.inquiry.internal.workflows.b.b(inquiryWorkflowFragment, this.f11656a);
            com.withpersona.sdk2.inquiry.internal.workflows.b.e(inquiryWorkflowFragment, this.G0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.f(inquiryWorkflowFragment, this.I0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.d(inquiryWorkflowFragment, this.f11656a.D0.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.a(inquiryWorkflowFragment, this.f11656a.f11638x.get());
            com.withpersona.sdk2.inquiry.internal.workflows.b.c(inquiryWorkflowFragment, g());
            return inquiryWorkflowFragment;
        }

        public fp.n0 g() {
            return new fp.n0(this.f11656a.f11571a0.get());
        }
    }

    public static final class i implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11707a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public vo.d a(IntegrationStepFragment integrationStepFragment) {
            dt.h.b(integrationStepFragment);
            return new j(this.f11707a, integrationStepFragment);
        }

        public i(f fVar) {
            this.f11707a = fVar;
        }
    }

    public static final class j implements vo.d {

        /* renamed from: a, reason: collision with root package name */
        public final f f11708a;
        public final j b = this;

        /* renamed from: c, reason: collision with root package name */
        public vo.c f11709c;

        /* renamed from: d, reason: collision with root package name */
        public dt.i<a.InterfaceC0209a> f11710d;

        /* renamed from: e, reason: collision with root package name */
        public wo.h f11711e;

        /* renamed from: f, reason: collision with root package name */
        public dt.i<b.c> f11712f;

        /* renamed from: g, reason: collision with root package name */
        public com.withpersona.sdk2.inquiry.integration.fragment.e f11713g;

        /* renamed from: h, reason: collision with root package name */
        public dt.i<d.a> f11714h;

        public j(f fVar, IntegrationStepFragment integrationStepFragment) {
            this.f11708a = fVar;
            b(integrationStepFragment);
        }

        public final void b(IntegrationStepFragment integrationStepFragment) {
            f fVar = this.f11708a;
            vo.c a10 = vo.c.a(fVar.f11632v, fVar.f11622r1);
            this.f11709c = a10;
            dt.i<a.InterfaceC0209a> b = com.withpersona.sdk2.inquiry.integration.b.b(a10);
            this.f11710d = b;
            f fVar2 = this.f11708a;
            wo.h a11 = wo.h.a(fVar2.f11632v, fVar2.f11595i1, b, fVar2.L, fVar2.E1);
            this.f11711e = a11;
            dt.i<b.c> b10 = com.withpersona.sdk2.inquiry.integration.fragment.c.b(a11);
            this.f11712f = b10;
            com.withpersona.sdk2.inquiry.integration.fragment.e a12 = com.withpersona.sdk2.inquiry.integration.fragment.e.a(b10);
            this.f11713g = a12;
            this.f11714h = com.withpersona.sdk2.inquiry.integration.fragment.f.b(a12);
        }

        @Override // bt.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(IntegrationStepFragment integrationStepFragment) {
            d(integrationStepFragment);
        }

        public final IntegrationStepFragment d(IntegrationStepFragment integrationStepFragment) {
            mq.b.a(integrationStepFragment, this.f11708a.a());
            com.withpersona.sdk2.inquiry.integration.fragment.a.b(integrationStepFragment, this.f11714h.get());
            com.withpersona.sdk2.inquiry.integration.fragment.a.a(integrationStepFragment, this.f11708a.D0.get());
            return integrationStepFragment;
        }
    }

    public static final class k implements g.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11715a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public dp.g a(dp.f fVar) {
            dt.h.b(fVar);
            return new l(this.f11715a, fVar);
        }

        public k(f fVar) {
            this.f11715a = fVar;
        }
    }

    public static final class l implements dp.g {

        /* renamed from: a, reason: collision with root package name */
        public final f f11716a;
        public final l b = this;

        public l(f fVar, dp.f fVar2) {
            this.f11716a = fVar;
        }

        @Override // bt.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(dp.f fVar) {
            c(fVar);
        }

        public final dp.f c(dp.f fVar) {
            mq.b.a(fVar, this.f11716a.a());
            dp.h.a(fVar, this.f11716a.D0.get());
            return fVar;
        }
    }

    public static final class m implements l1.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11717a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l1 a(PermissionRequestFragment permissionRequestFragment) {
            dt.h.b(permissionRequestFragment);
            return new n(this.f11717a, permissionRequestFragment);
        }

        public m(f fVar) {
            this.f11717a = fVar;
        }
    }

    public static final class n implements l1 {

        /* renamed from: a, reason: collision with root package name */
        public final f f11718a;
        public final n b = this;

        /* renamed from: c, reason: collision with root package name */
        public dt.i<d.a> f11719c;

        /* renamed from: d, reason: collision with root package name */
        public pp.j f11720d;

        /* renamed from: e, reason: collision with root package name */
        public dt.i<a.InterfaceC0230a> f11721e;

        /* renamed from: f, reason: collision with root package name */
        public sp.l f11722f;

        /* renamed from: g, reason: collision with root package name */
        public dt.i<PermissionRequestStateManager.c> f11723g;

        /* renamed from: h, reason: collision with root package name */
        public rp.c f11724h;

        /* renamed from: i, reason: collision with root package name */
        public dt.i<c.a> f11725i;

        public n(f fVar, PermissionRequestFragment permissionRequestFragment) {
            this.f11718a = fVar;
            b(permissionRequestFragment);
        }

        public final void b(PermissionRequestFragment permissionRequestFragment) {
            f fVar = this.f11718a;
            this.f11719c = com.withpersona.sdk2.inquiry.permissions.e.a(fVar.f11632v, fVar.f11598j1, fVar.L);
            f fVar2 = this.f11718a;
            pp.j a10 = pp.j.a(fVar2.f11601k1, fVar2.f11632v);
            this.f11720d = a10;
            dt.i<a.InterfaceC0230a> b = com.withpersona.sdk2.inquiry.permissions.b.b(a10);
            this.f11721e = b;
            f fVar3 = this.f11718a;
            sp.l a11 = sp.l.a(fVar3.f11632v, this.f11719c, b, fVar3.L, fVar3.E1);
            this.f11722f = a11;
            dt.i<PermissionRequestStateManager.c> b10 = com.withpersona.sdk2.inquiry.permissions.state.a.b(a11);
            this.f11723g = b10;
            rp.c a12 = rp.c.a(b10);
            this.f11724h = a12;
            this.f11725i = com.withpersona.sdk2.inquiry.permissions.permissionRequest.d.b(a12);
        }

        @Override // bt.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(PermissionRequestFragment permissionRequestFragment) {
            d(permissionRequestFragment);
        }

        public final PermissionRequestFragment d(PermissionRequestFragment permissionRequestFragment) {
            mq.b.a(permissionRequestFragment, this.f11718a.a());
            com.withpersona.sdk2.inquiry.permissions.permissionRequest.a.a(permissionRequestFragment, this.f11725i.get());
            return permissionRequestFragment;
        }
    }

    public static final class o implements c0.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11726a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public wp.c0 a(SelfieStepFragment selfieStepFragment) {
            dt.h.b(selfieStepFragment);
            return new p(this.f11726a, selfieStepFragment);
        }

        public o(f fVar) {
            this.f11726a = fVar;
        }
    }

    public static final class p implements wp.c0 {

        /* renamed from: a, reason: collision with root package name */
        public final f f11727a;
        public final p b = this;

        /* renamed from: c, reason: collision with root package name */
        public aq.c f11728c;

        /* renamed from: d, reason: collision with root package name */
        public dt.i<b.a> f11729d;

        /* renamed from: e, reason: collision with root package name */
        public dt.i<b.a> f11730e;

        /* renamed from: f, reason: collision with root package name */
        public wp.v f11731f;

        /* renamed from: g, reason: collision with root package name */
        public dt.i<e.b> f11732g;

        /* renamed from: h, reason: collision with root package name */
        public rp.d f11733h;

        /* renamed from: i, reason: collision with root package name */
        public dt.i<e.a> f11734i;

        /* renamed from: j, reason: collision with root package name */
        public dn.t f11735j;

        /* renamed from: k, reason: collision with root package name */
        public dt.i<e.a> f11736k;

        /* renamed from: l, reason: collision with root package name */
        public fn.c0 f11737l;

        /* renamed from: m, reason: collision with root package name */
        public dt.i<b0.a> f11738m;

        /* renamed from: n, reason: collision with root package name */
        public fn.e f11739n;

        /* renamed from: o, reason: collision with root package name */
        public dt.i<c.a> f11740o;

        /* renamed from: p, reason: collision with root package name */
        public bq.b f11741p;

        /* renamed from: q, reason: collision with root package name */
        public dt.i<a.b> f11742q;

        /* renamed from: r, reason: collision with root package name */
        public dt.i<com.withpersona.sdk2.inquiry.selfie.g> f11743r;

        /* renamed from: s, reason: collision with root package name */
        public m2 f11744s;

        /* renamed from: t, reason: collision with root package name */
        public dt.i<k2.d> f11745t;

        /* renamed from: u, reason: collision with root package name */
        public cq.l f11746u;

        /* renamed from: v, reason: collision with root package name */
        public dt.i<b.a> f11747v;

        public p(f fVar, SelfieStepFragment selfieStepFragment) {
            this.f11727a = fVar;
            b(selfieStepFragment);
        }

        public final void b(SelfieStepFragment selfieStepFragment) {
            f fVar = this.f11727a;
            aq.c a10 = aq.c.a(fVar.f11632v, fVar.f11607m1, fVar.f11580d1, fVar.C0, fVar.f11583e1, fVar.f11589g1, fVar.L, fVar.S0);
            this.f11728c = a10;
            this.f11729d = aq.d.b(a10);
            this.f11730e = rr.c.a(this.f11727a.f11604l1);
            f fVar2 = this.f11727a;
            wp.v a11 = wp.v.a(fVar2.Q, fVar2.f11587g);
            this.f11731f = a11;
            this.f11732g = com.withpersona.sdk2.inquiry.selfie.f.b(a11);
            rp.d a12 = rp.d.a(this.f11727a.Q0);
            this.f11733h = a12;
            this.f11734i = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(a12);
            f fVar3 = this.f11727a;
            dn.t a13 = dn.t.a(fVar3.f11632v, fVar3.f11589g1, fVar3.f11587g);
            this.f11735j = a13;
            this.f11736k = com.withpersona.sdk2.camera.f.b(a13);
            f fVar4 = this.f11727a;
            fn.c0 a14 = fn.c0.a(fVar4.f11632v, fVar4.f11589g1, fVar4.f11587g, fVar4.R, fVar4.G, fVar4.L, fVar4.F0, fVar4.f11638x);
            this.f11737l = a14;
            dt.i<b0.a> b = d0.b(a14);
            this.f11738m = b;
            f fVar5 = this.f11727a;
            fn.e a15 = fn.e.a(b, fVar5.R, fVar5.H, fVar5.L);
            this.f11739n = a15;
            this.f11740o = fn.f.b(a15);
            f fVar6 = this.f11727a;
            bq.b a16 = bq.b.a(fVar6.f11635w, fVar6.f11607m1, fVar6.H, fVar6.f11610n1);
            this.f11741p = a16;
            this.f11742q = bq.c.b(a16);
            f fVar7 = this.f11727a;
            wp.w a17 = wp.w.a(fVar7.F0, fVar7.L);
            this.f11743r = a17;
            f fVar8 = this.f11727a;
            m2 a18 = m2.a(fVar8.f11632v, this.f11729d, this.f11730e, this.f11732g, this.f11734i, this.f11736k, this.f11740o, fVar8.f11589g1, fVar8.f11595i1, fVar8.S0, fVar8.E1, this.f11742q, a17, fVar8.f11638x, fVar8.f11587g);
            this.f11744s = a18;
            dt.i<k2.d> b10 = n2.b(a18);
            this.f11745t = b10;
            cq.l a19 = cq.l.a(b10);
            this.f11746u = a19;
            this.f11747v = com.withpersona.sdk2.inquiry.selfie.selfieStep.c.b(a19);
        }

        @Override // bt.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(SelfieStepFragment selfieStepFragment) {
            d(selfieStepFragment);
        }

        public final SelfieStepFragment d(SelfieStepFragment selfieStepFragment) {
            mq.b.a(selfieStepFragment, this.f11727a.a());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.f(selfieStepFragment, this.f11747v.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.a(selfieStepFragment, this.f11727a.l());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.c(selfieStepFragment, dt.c.b(this.f11727a.Q));
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.e(selfieStepFragment, this.f11727a.L.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.d(selfieStepFragment, this.f11727a.D0.get());
            com.withpersona.sdk2.inquiry.selfie.selfieStep.a.b(selfieStepFragment, this.f11727a.f11638x.get());
            return selfieStepFragment;
        }
    }

    public static final class q implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11748a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public qr.c a(UiStepFragment uiStepFragment) {
            dt.h.b(uiStepFragment);
            return new r(this.f11748a, uiStepFragment);
        }

        public q(f fVar) {
            this.f11748a = fVar;
        }
    }

    public static final class r implements qr.c {

        /* renamed from: a, reason: collision with root package name */
        public final f f11749a;
        public final r b = this;

        /* renamed from: c, reason: collision with root package name */
        public op.k f11750c;

        /* renamed from: d, reason: collision with root package name */
        public dt.i<b.a> f11751d;

        /* renamed from: e, reason: collision with root package name */
        public jp.o f11752e;

        /* renamed from: f, reason: collision with root package name */
        public dt.i<n.a> f11753f;

        /* renamed from: g, reason: collision with root package name */
        public mr.l1 f11754g;

        /* renamed from: h, reason: collision with root package name */
        public dt.i<d.a> f11755h;

        /* renamed from: i, reason: collision with root package name */
        public k6 f11756i;

        /* renamed from: j, reason: collision with root package name */
        public dt.i<k.a> f11757j;

        /* renamed from: k, reason: collision with root package name */
        public dt.i<b.a> f11758k;

        /* renamed from: l, reason: collision with root package name */
        public dt.i<a.C0492a> f11759l;

        /* renamed from: m, reason: collision with root package name */
        public dt.i<h.a> f11760m;

        /* renamed from: n, reason: collision with root package name */
        public dt.i<pr.e0> f11761n;

        /* renamed from: o, reason: collision with root package name */
        public rp.d f11762o;

        /* renamed from: p, reason: collision with root package name */
        public dt.i<e.a> f11763p;

        /* renamed from: q, reason: collision with root package name */
        public h1 f11764q;

        /* renamed from: r, reason: collision with root package name */
        public dt.i<g1.e> f11765r;

        /* renamed from: s, reason: collision with root package name */
        public qr.d f11766s;

        /* renamed from: t, reason: collision with root package name */
        public dt.i<b.a> f11767t;

        public r(f fVar, UiStepFragment uiStepFragment) {
            this.f11749a = fVar;
            b(uiStepFragment);
        }

        public final void b(UiStepFragment uiStepFragment) {
            f fVar = this.f11749a;
            op.k a10 = op.k.a(fVar.f11613o1, fVar.f11632v, fVar.f11571a0, fVar.f11587g, fVar.f11638x);
            this.f11750c = a10;
            this.f11751d = com.withpersona.sdk2.inquiry.nfc.c.b(a10);
            f fVar2 = this.f11749a;
            jp.o a11 = jp.o.a(fVar2.f11616p1, fVar2.f11632v, fVar2.f11571a0);
            this.f11752e = a11;
            this.f11753f = jp.p.b(a11);
            f fVar3 = this.f11749a;
            mr.l1 a12 = mr.l1.a(fVar3.f11619q1, fVar3.V0, fVar3.f11622r1);
            this.f11754g = a12;
            this.f11755h = com.withpersona.sdk2.inquiry.ui.e.b(a12);
            f fVar4 = this.f11749a;
            k6 a13 = k6.a(fVar4.f11622r1, fVar4.f11619q1, fVar4.D);
            this.f11756i = a13;
            this.f11757j = com.withpersona.sdk2.inquiry.ui.l.b(a13);
            this.f11758k = com.withpersona.sdk2.inquiry.ui.network.c.a(this.f11749a.f11619q1);
            this.f11759l = or.b.a(this.f11749a.f11619q1);
            f fVar5 = this.f11749a;
            this.f11760m = com.withpersona.sdk2.inquiry.ui.i.a(fVar5.f11625s1, fVar5.f11592h1, fVar5.f11632v);
            this.f11761n = pr.f0.a(this.f11749a.f11632v, this.f11758k, this.f11759l, xq.b.a(), this.f11760m);
            rp.d a14 = rp.d.a(this.f11749a.Q0);
            this.f11762o = a14;
            dt.i<e.a> b = com.withpersona.sdk2.inquiry.permissions.permissionRequest.f.b(a14);
            this.f11763p = b;
            f fVar6 = this.f11749a;
            h1 a15 = h1.a(fVar6.f11632v, this.f11751d, this.f11753f, fVar6.f11571a0, this.f11755h, this.f11757j, fVar6.f11595i1, this.f11761n, fVar6.F0, fVar6.f11638x, fVar6.L, b, fVar6.E1);
            this.f11764q = a15;
            dt.i<g1.e> b10 = i1.b(a15);
            this.f11765r = b10;
            qr.d a16 = qr.d.a(b10);
            this.f11766s = a16;
            this.f11767t = com.withpersona.sdk2.inquiry.ui.uiStep.c.b(a16);
        }

        @Override // bt.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(UiStepFragment uiStepFragment) {
            d(uiStepFragment);
        }

        public final UiStepFragment d(UiStepFragment uiStepFragment) {
            mq.b.a(uiStepFragment, this.f11749a.a());
            com.withpersona.sdk2.inquiry.ui.uiStep.a.b(uiStepFragment, this.f11767t.get());
            com.withpersona.sdk2.inquiry.ui.uiStep.a.a(uiStepFragment, this.f11749a.D0.get());
            return uiStepFragment;
        }
    }

    public static final class s implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public final f f11768a;

        @Override // bt.a.InterfaceC0091a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public hp.c a(hp.b bVar) {
            dt.h.b(bVar);
            return new t(this.f11768a, bVar);
        }

        public s(f fVar) {
            this.f11768a = fVar;
        }
    }

    public static final class t implements hp.c {

        /* renamed from: a, reason: collision with root package name */
        public final f f11769a;
        public final t b = this;

        public t(f fVar, hp.b bVar) {
            this.f11769a = fVar;
        }

        @Override // bt.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(hp.b bVar) {
            c(bVar);
        }

        public final hp.b c(hp.b bVar) {
            mq.b.a(bVar, this.f11769a.a());
            hp.d.b(bVar, this.f11769a.W.get());
            hp.d.a(bVar, this.f11769a.D0.get());
            return bVar;
        }
    }

    public static a a() {
        return new a();
    }
}
