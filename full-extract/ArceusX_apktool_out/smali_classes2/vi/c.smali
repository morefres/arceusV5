.class public Lvi/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/c$b;
    }
.end annotation


# instance fields
.field public a:Lrg/x0;


# direct methods
.method public constructor <init>(Lrg/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvi/c;->a:Lrg/x0;

    return-void
.end method

.method public static bridge synthetic a(Lvi/c;Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvi/c;->b(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {}, Lti/b;->f()Lti/b;

    move-result-object v0

    sget-object v1, Lti/b$d;->a:Lti/b$d;

    invoke-virtual {v0, p1, v1}, Lti/b;->i(Landroid/app/Activity;Lti/b$d;)V

    :cond_0
    return-void
.end method

.method public c(Landroidx/lifecycle/r;)V
    .locals 4

    iget-object v0, p0, Lvi/c;->a:Lrg/x0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "logout"

    invoke-static {v0}, Lrg/t0;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lvi/c;->a:Lrg/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    new-instance v1, Lrg/d0;

    invoke-direct {v1}, Lrg/d0;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Le4/k;->r2(II)V

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/c;->a()Landroidx/lifecycle/l;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_1
    new-instance p1, Lvi/c$a;

    invoke-direct {p1, p0, v0}, Lvi/c$a;-><init>(Lvi/c;Le4/q;)V

    invoke-virtual {v1, p1}, Lrg/d0;->B2(Lrg/d0$d;)V

    invoke-virtual {v0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    const-string v0, "dialog"

    invoke-virtual {v1, p1, v0}, Le4/k;->t2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method
