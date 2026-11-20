.class public Lbk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbk/b$b;
    }
.end annotation


# instance fields
.field public a:Lck/a;

.field public b:Lbk/b$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lck/a;

    invoke-direct {v0}, Lck/a;-><init>()V

    iput-object v0, p0, Lbk/b;->a:Lck/a;

    return-void
.end method

.method public static bridge synthetic a(Lbk/b;Lml/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lbk/b;->c(Lml/a;)V

    return-void
.end method


# virtual methods
.method public b(Lbk/b$b;)V
    .locals 3

    iput-object p1, p0, Lbk/b;->b:Lbk/b$b;

    iget-object p1, p0, Lbk/b;->a:Lck/a;

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0}, Ldk/c;->j()J

    move-result-wide v0

    new-instance v2, Lbk/b$a;

    invoke-direct {v2, p0}, Lbk/b$a;-><init>(Lbk/b;)V

    invoke-virtual {p1, v0, v1, v2}, Lck/a;->d(JLbk/a;)V

    return-void
.end method

.method public final c(Lml/a;)V
    .locals 1

    iget-object v0, p0, Lbk/b;->b:Lbk/b$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lbk/b$b;->a(Lml/a;)V

    :cond_0
    return-void
.end method
