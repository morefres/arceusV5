.class public Ldk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk/a$b;
    }
.end annotation


# instance fields
.field public final a:Lci/m;

.field public b:Z


# direct methods
.method public constructor <init>(Lci/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldk/a;->b:Z

    iput-object p1, p0, Ldk/a;->a:Lci/m;

    return-void
.end method

.method public static bridge synthetic a(Ldk/a;)Lci/m;
    .locals 0

    iget-object p0, p0, Ldk/a;->a:Lci/m;

    return-object p0
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldk/a;->b:Z

    return-void
.end method

.method public c()V
    .locals 4

    invoke-static {}, Lci/g;->a()Lci/f;

    move-result-object v0

    invoke-static {}, Lrg/a1;->b1()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ldk/a$a;

    invoke-direct {v2, p0}, Ldk/a$a;-><init>(Ldk/a;)V

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lci/f;->b(Ljava/lang/String;[Lci/c$a;Lci/l;)Lci/d;

    move-result-object v0

    iget-boolean v1, p0, Ldk/a;->b:Z

    if-eqz v1, :cond_0

    new-instance v1, Ldk/a$b;

    invoke-direct {v1, v3}, Ldk/a$b;-><init>(Ldk/b;)V

    invoke-virtual {v0, v1}, Lci/a;->g(Lfi/d;)V

    :cond_0
    invoke-virtual {v0}, Lci/a;->b()V

    return-void
.end method
