.class public Ldj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lti/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object v0

    iput-object v0, p0, Ldj/n;->a:Lti/g;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->c0()V

    :cond_0
    return-void
.end method

.method public B()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->d0()V

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->e0(ZZ)V

    :cond_0
    return-void
.end method

.method public D(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->f0(ZZ)V

    :cond_0
    return-void
.end method

.method public E(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->g0(ZZ)V

    :cond_0
    return-void
.end method

.method public a(Lcj/n;Ljava/lang/String;)V
    .locals 4

    const-string v0, "rbx.purchaseflow"

    invoke-static {v0, p2}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_0

    new-instance v0, Lji/a;

    const-string v1, "Android-PurchaseFlow"

    invoke-direct {v0, v1}, Lji/a;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lji/a;->m(Z)Lji/a;

    move-result-object v0

    const-string v1, "UserId"

    invoke-virtual {p1}, Lcj/n;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lji/a;->c(Ljava/lang/String;J)Lji/a;

    move-result-object v0

    const-string v1, "InAppPurchase"

    invoke-virtual {p1}, Lcj/n;->c()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lji/a;->e(Ljava/lang/String;Z)Lji/a;

    move-result-object v0

    const-string v1, "ProductId"

    invoke-virtual {p1}, Lcj/n;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lji/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lji/a;

    move-result-object p1

    const-string v0, "Message"

    invoke-virtual {p1, v0, p2}, Lji/a;->d(Ljava/lang/String;Ljava/lang/Object;)Lji/a;

    move-result-object p1

    invoke-static {}, Lrg/u;->g()Lrg/u;

    move-result-object p2

    invoke-virtual {p2}, Lrg/u;->h()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v0, "Rooted"

    invoke-virtual {p1, v0, p2}, Lji/a;->f(Ljava/lang/String;Ljava/lang/Object;)Lji/a;

    move-result-object p1

    invoke-virtual {p1}, Lji/a;->g()Lih/c;

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lti/g;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0, p1}, Lti/g;->n(Z)V

    :cond_0
    return-void
.end method

.method public d(Z)V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0, p1}, Lti/g;->o(Z)V

    :cond_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0, p1}, Lti/g;->p(Z)V

    :cond_0
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0, p1}, Lti/g;->q(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->t()V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->u()V

    :cond_0
    return-void
.end method

.method public i()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->v()V

    :cond_0
    return-void
.end method

.method public j(Z)V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0, p1}, Lti/g;->y(Z)V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->L()V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->M()V

    :cond_0
    return-void
.end method

.method public m()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->N()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->O()V

    :cond_0
    return-void
.end method

.method public o()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->P()V

    :cond_0
    return-void
.end method

.method public p()V
    .locals 1

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    invoke-virtual {v0}, Lti/g;->R()V

    :cond_0
    return-void
.end method

.method public q(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->S(ZZ)V

    :cond_0
    return-void
.end method

.method public r(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->T(ZZ)V

    :cond_0
    return-void
.end method

.method public s(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->a0(ZZ)V

    :cond_0
    return-void
.end method

.method public t(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->U(ZZ)V

    :cond_0
    return-void
.end method

.method public u(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->V(ZZ)V

    :cond_0
    return-void
.end method

.method public v(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->W(ZZ)V

    :cond_0
    return-void
.end method

.method public w(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->X(ZZ)V

    :cond_0
    return-void
.end method

.method public x(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->Y(ZZ)V

    :cond_0
    return-void
.end method

.method public y(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->Z(ZZ)V

    :cond_0
    return-void
.end method

.method public z(Z)V
    .locals 2

    invoke-static {}, Lmh/b;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ldj/n;->a:Lti/g;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lti/g;->b0(ZZ)V

    :cond_0
    return-void
.end method
