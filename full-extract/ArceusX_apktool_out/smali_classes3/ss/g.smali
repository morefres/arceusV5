.class public Lss/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lss/g$a;
    }
.end annotation


# instance fields
.field public final a:Lts/c;

.field public final b:Lws/a;

.field public final c:Lys/a;

.field public final d:Lss/c;

.field public final e:Lxs/a;

.field public final f:Lws/d;

.field public final g:Lss/k;


# direct methods
.method public constructor <init>(Lss/g$a;)V
    .locals 1
    .param p1    # Lss/g$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lss/g$a;->g(Lss/g$a;)Lts/c;

    move-result-object v0

    iput-object v0, p0, Lss/g;->a:Lts/c;

    .line 4
    invoke-static {p1}, Lss/g$a;->a(Lss/g$a;)Lws/a;

    move-result-object v0

    iput-object v0, p0, Lss/g;->b:Lws/a;

    .line 5
    invoke-static {p1}, Lss/g$a;->f(Lss/g$a;)Lys/a;

    move-result-object v0

    iput-object v0, p0, Lss/g;->c:Lys/a;

    .line 6
    invoke-static {p1}, Lss/g$a;->d(Lss/g$a;)Lss/c;

    move-result-object v0

    iput-object v0, p0, Lss/g;->d:Lss/c;

    .line 7
    invoke-static {p1}, Lss/g$a;->b(Lss/g$a;)Lxs/a;

    move-result-object v0

    iput-object v0, p0, Lss/g;->e:Lxs/a;

    .line 8
    invoke-static {p1}, Lss/g$a;->c(Lss/g$a;)Lws/d;

    move-result-object v0

    iput-object v0, p0, Lss/g;->f:Lws/d;

    .line 9
    invoke-static {p1}, Lss/g$a;->e(Lss/g$a;)Lss/k;

    move-result-object p1

    iput-object p1, p0, Lss/g;->g:Lss/k;

    return-void
.end method

.method public synthetic constructor <init>(Lss/g$a;Lss/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lss/g;-><init>(Lss/g$a;)V

    return-void
.end method


# virtual methods
.method public a()Lxs/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/g;->e:Lxs/a;

    return-object v0
.end method

.method public b()Lss/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/g;->d:Lss/c;

    return-object v0
.end method

.method public c()Lss/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/g;->g:Lss/k;

    return-object v0
.end method

.method public d()Lys/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/g;->c:Lys/a;

    return-object v0
.end method

.method public e()Lts/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lss/g;->a:Lts/c;

    return-object v0
.end method
