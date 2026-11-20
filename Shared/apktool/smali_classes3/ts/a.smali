.class public Lts/a;
.super Lss/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lts/a$p;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lts/a$p;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lss/a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lts/a;->a:Ljava/util/List;

    return-void
.end method

.method public static A(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$o;

    invoke-direct {v0}, Lts/a$o;-><init>()V

    const-class v1, Lon/r;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static B(Lon/s;)I
    .locals 2
    .param p0    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lon/s;->g()Lon/s;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    instance-of v1, p0, Lon/r;

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    invoke-virtual {p0}, Lon/s;->g()Lon/s;

    move-result-object p0

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static C(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/d;

    invoke-direct {v0}, Lts/d;-><init>()V

    const-class v1, Lon/v;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static D(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$e;

    invoke-direct {v0}, Lts/a$e;-><init>()V

    const-class v1, Lon/w;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static E(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$c;

    invoke-direct {v0}, Lts/a$c;-><init>()V

    const-class v1, Lon/x;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static F(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$h;

    invoke-direct {v0}, Lts/a$h;-><init>()V

    const-class v1, Lon/a0;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static H(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$a;

    invoke-direct {v0}, Lts/a$a;-><init>()V

    const-class v1, Lon/c0;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static I(Lss/m;Ljava/lang/String;Ljava/lang/String;Lon/s;)V
    .locals 4
    .param p0    # Lss/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lon/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p0, p3}, Lss/m;->g(Lon/s;)V

    invoke-interface {p0}, Lss/m;->length()I

    move-result v0

    invoke-interface {p0}, Lss/m;->builder()Lss/u;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Lss/u;->a(C)Lss/u;

    move-result-object v1

    const/16 v3, 0xa

    invoke-virtual {v1, v3}, Lss/u;->a(C)Lss/u;

    move-result-object v1

    invoke-interface {p0}, Lss/m;->x()Lss/g;

    move-result-object v3

    invoke-virtual {v3}, Lss/g;->d()Lys/a;

    move-result-object v3

    invoke-interface {v3, p1, p2}, Lys/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v1, p2}, Lss/u;->b(Ljava/lang/CharSequence;)Lss/u;

    invoke-interface {p0}, Lss/m;->z()V

    invoke-interface {p0}, Lss/m;->builder()Lss/u;

    move-result-object p2

    invoke-virtual {p2, v2}, Lss/u;->a(C)Lss/u;

    sget-object p2, Lts/b;->g:Lss/p;

    invoke-interface {p0}, Lss/m;->n()Lss/r;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Lss/p;->d(Lss/r;Ljava/lang/Object;)V

    invoke-interface {p0, p3, v0}, Lss/m;->p(Lon/s;I)V

    invoke-interface {p0, p3}, Lss/m;->s(Lon/s;)V

    return-void
.end method

.method public static bridge synthetic l(Lts/a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lts/a;->a:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic m(Lon/w;)Z
    .locals 0

    invoke-static {p0}, Lts/a;->y(Lon/w;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic n(Lon/s;)I
    .locals 0

    invoke-static {p0}, Lts/a;->B(Lon/s;)I

    move-result p0

    return p0
.end method

.method public static o(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$j;

    invoke-direct {v0}, Lts/a$j;-><init>()V

    const-class v1, Lon/b;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static p(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/d;

    invoke-direct {v0}, Lts/d;-><init>()V

    const-class v1, Lon/c;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static q(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$k;

    invoke-direct {v0}, Lts/a$k;-><init>()V

    const-class v1, Lon/d;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static r()Lts/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lts/a;

    invoke-direct {v0}, Lts/a;-><init>()V

    return-object v0
.end method

.method public static s(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$i;

    invoke-direct {v0}, Lts/a$i;-><init>()V

    const-class v1, Lon/g;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static t(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$l;

    invoke-direct {v0}, Lts/a$l;-><init>()V

    const-class v1, Lon/h;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static u(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$d;

    invoke-direct {v0}, Lts/a$d;-><init>()V

    const-class v1, Lon/i;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static v(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$b;

    invoke-direct {v0}, Lts/a$b;-><init>()V

    const-class v1, Lon/j;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static w(Lss/m$b;)V
    .locals 2

    new-instance v0, Lts/a$n;

    invoke-direct {v0}, Lts/a$n;-><init>()V

    const-class v1, Lon/m;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static x(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$m;

    invoke-direct {v0}, Lts/a$m;-><init>()V

    const-class v1, Lon/n;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public static y(Lon/w;)Z
    .locals 1
    .param p0    # Lon/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lon/a;->o()Lon/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lon/s;->g()Lon/s;

    move-result-object p0

    instance-of v0, p0, Lon/q;

    if-eqz v0, :cond_0

    check-cast p0, Lon/q;

    invoke-virtual {p0}, Lon/q;->p()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static z(Lss/m$b;)V
    .locals 2
    .param p0    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$f;

    invoke-direct {v0}, Lts/a$f;-><init>()V

    const-class v1, Lon/o;

    invoke-interface {p0, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method


# virtual methods
.method public final G(Lss/m$b;)V
    .locals 2
    .param p1    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lts/a$g;

    invoke-direct {v0, p0}, Lts/a$g;-><init>(Lts/a;)V

    const-class v1, Lon/b0;

    invoke-interface {p1, v1, v0}, Lss/m$b;->b(Ljava/lang/Class;Lss/m$c;)Lss/m$b;

    return-void
.end method

.method public a(Lss/m$b;)V
    .locals 0
    .param p1    # Lss/m$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lts/a;->G(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->F(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->s(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->o(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->q(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->t(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->x(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->w(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->p(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->C(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->A(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->H(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->v(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->E(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->u(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->D(Lss/m$b;)V

    invoke-static {p1}, Lts/a;->z(Lss/m$b;)V

    return-void
.end method

.method public c(Landroid/widget/TextView;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-boolean v0, p0, Lts/a;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    :cond_0
    return-void
.end method

.method public f(Lss/k$a;)V
    .locals 3
    .param p1    # Lss/k$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lus/b;

    invoke-direct {v0}, Lus/b;-><init>()V

    new-instance v1, Lus/h;

    invoke-direct {v1}, Lus/h;-><init>()V

    const-class v2, Lon/a0;

    invoke-interface {p1, v2, v1}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v1, Lus/d;

    invoke-direct {v1}, Lus/d;-><init>()V

    const-class v2, Lon/g;

    invoke-interface {p1, v2, v1}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v1, Lus/a;

    invoke-direct {v1}, Lus/a;-><init>()V

    const-class v2, Lon/b;

    invoke-interface {p1, v2, v1}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v1, Lus/c;

    invoke-direct {v1}, Lus/c;-><init>()V

    const-class v2, Lon/d;

    invoke-interface {p1, v2, v1}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    const-class v1, Lon/h;

    invoke-interface {p1, v1, v0}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    const-class v1, Lon/n;

    invoke-interface {p1, v1, v0}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v0, Lus/g;

    invoke-direct {v0}, Lus/g;-><init>()V

    const-class v1, Lon/r;

    invoke-interface {p1, v1, v0}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v0, Lus/e;

    invoke-direct {v0}, Lus/e;-><init>()V

    const-class v1, Lon/j;

    invoke-interface {p1, v1, v0}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v0, Lus/f;

    invoke-direct {v0}, Lus/f;-><init>()V

    const-class v1, Lon/o;

    invoke-interface {p1, v1, v0}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    move-result-object p1

    new-instance v0, Lus/i;

    invoke-direct {v0}, Lus/i;-><init>()V

    const-class v1, Lon/c0;

    invoke-interface {p1, v1, v0}, Lss/k$a;->a(Ljava/lang/Class;Lss/t;)Lss/k$a;

    return-void
.end method

.method public k(Landroid/widget/TextView;Landroid/text/Spanned;)V
    .locals 1
    .param p1    # Landroid/widget/TextView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/text/Spanned;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1, p2}, Lvs/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    instance-of v0, p2, Landroid/text/Spannable;

    if-eqz v0, :cond_0

    check-cast p2, Landroid/text/Spannable;

    invoke-static {p2, p1}, Lvs/j;->a(Landroid/text/Spannable;Landroid/widget/TextView;)V

    :cond_0
    return-void
.end method
