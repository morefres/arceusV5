.class public Loi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Loi/h$c;,
        Loi/h$d;
    }
.end annotation


# instance fields
.field public a:Lqi/a;

.field public b:Loi/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lqi/a;

    invoke-direct {v0}, Lqi/a;-><init>()V

    iput-object v0, p0, Loi/h;->a:Lqi/a;

    invoke-static {}, Loi/b;->f()Loi/b;

    move-result-object v0

    iput-object v0, p0, Loi/h;->b:Loi/b;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Loi/h$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Loi/h;->b(Landroid/content/Context;ZLoi/h$c;)V

    return-void
.end method

.method public b(Landroid/content/Context;ZLoi/h$c;)V
    .locals 3

    iget-object v0, p0, Loi/h;->a:Lqi/a;

    iget-object v1, p0, Loi/h;->b:Loi/b;

    invoke-virtual {v1}, Loi/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Loi/h$a;

    invoke-direct {v2, p0, p2, p1, p3}, Loi/h$a;-><init>(Loi/h;ZLandroid/content/Context;Loi/h$c;)V

    invoke-virtual {v0, v1, v2}, Lqi/a;->d(Ljava/util/Locale;Loi/g;)V

    return-void
.end method

.method public c(Landroid/content/Context;Loi/h$d;)V
    .locals 3

    iget-object v0, p0, Loi/h;->a:Lqi/a;

    iget-object v1, p0, Loi/h;->b:Loi/b;

    invoke-virtual {v1}, Loi/b;->e()Ljava/util/Locale;

    move-result-object v1

    new-instance v2, Loi/h$b;

    invoke-direct {v2, p0, p1, p2}, Loi/h$b;-><init>(Loi/h;Landroid/content/Context;Loi/h$d;)V

    invoke-virtual {v0, v1, v2}, Lqi/a;->d(Ljava/util/Locale;Loi/g;)V

    return-void
.end method
