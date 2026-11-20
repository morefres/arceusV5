.class public Lss/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lss/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lts/c;

.field public b:Lws/a;

.field public c:Lys/a;

.field public d:Lss/c;

.field public e:Lxs/a;

.field public f:Lws/d;

.field public g:Lss/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lss/g$a;)Lws/a;
    .locals 0

    iget-object p0, p0, Lss/g$a;->b:Lws/a;

    return-object p0
.end method

.method public static bridge synthetic b(Lss/g$a;)Lxs/a;
    .locals 0

    iget-object p0, p0, Lss/g$a;->e:Lxs/a;

    return-object p0
.end method

.method public static bridge synthetic c(Lss/g$a;)Lws/d;
    .locals 0

    iget-object p0, p0, Lss/g$a;->f:Lws/d;

    return-object p0
.end method

.method public static bridge synthetic d(Lss/g$a;)Lss/c;
    .locals 0

    iget-object p0, p0, Lss/g$a;->d:Lss/c;

    return-object p0
.end method

.method public static bridge synthetic e(Lss/g$a;)Lss/k;
    .locals 0

    iget-object p0, p0, Lss/g$a;->g:Lss/k;

    return-object p0
.end method

.method public static bridge synthetic f(Lss/g$a;)Lys/a;
    .locals 0

    iget-object p0, p0, Lss/g$a;->c:Lys/a;

    return-object p0
.end method

.method public static bridge synthetic g(Lss/g$a;)Lts/c;
    .locals 0

    iget-object p0, p0, Lss/g$a;->a:Lts/c;

    return-object p0
.end method


# virtual methods
.method public h(Lts/c;Lss/k;)Lss/g;
    .locals 0
    .param p1    # Lts/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lss/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lss/g$a;->a:Lts/c;

    iput-object p2, p0, Lss/g$a;->g:Lss/k;

    iget-object p1, p0, Lss/g$a;->b:Lws/a;

    if-nez p1, :cond_0

    invoke-static {}, Lws/a;->a()Lws/a;

    move-result-object p1

    iput-object p1, p0, Lss/g$a;->b:Lws/a;

    :cond_0
    iget-object p1, p0, Lss/g$a;->c:Lys/a;

    if-nez p1, :cond_1

    new-instance p1, Lys/b;

    invoke-direct {p1}, Lys/b;-><init>()V

    iput-object p1, p0, Lss/g$a;->c:Lys/a;

    :cond_1
    iget-object p1, p0, Lss/g$a;->d:Lss/c;

    if-nez p1, :cond_2

    new-instance p1, Lss/d;

    invoke-direct {p1}, Lss/d;-><init>()V

    iput-object p1, p0, Lss/g$a;->d:Lss/c;

    :cond_2
    iget-object p1, p0, Lss/g$a;->e:Lxs/a;

    if-nez p1, :cond_3

    invoke-static {}, Lxs/a;->a()Lxs/a;

    move-result-object p1

    iput-object p1, p0, Lss/g$a;->e:Lxs/a;

    :cond_3
    iget-object p1, p0, Lss/g$a;->f:Lws/d;

    if-nez p1, :cond_4

    new-instance p1, Lws/e;

    invoke-direct {p1}, Lws/e;-><init>()V

    iput-object p1, p0, Lss/g$a;->f:Lws/d;

    :cond_4
    new-instance p1, Lss/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lss/g;-><init>(Lss/g$a;Lss/h;)V

    return-object p1
.end method
