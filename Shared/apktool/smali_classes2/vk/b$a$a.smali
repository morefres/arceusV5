.class public Lvk/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk/b$a;->b(Liv/d;Liv/x;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Liv/x;

.field public final synthetic b:Lvk/b$a;


# direct methods
.method public constructor <init>(Lvk/b$a;Liv/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvk/b$a$a;->b:Lvk/b$a;

    iput-object p2, p0, Lvk/b$a$a;->a:Liv/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lvk/b$a$a;->b:Lvk/b$a;

    iget-object v0, v0, Lvk/b$a;->c:Lvk/b;

    iget-object v0, v0, Lvk/b;->b:Liv/d;

    invoke-interface {v0}, Liv/d;->isCanceled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvk/b$a$a;->b:Lvk/b$a;

    invoke-static {v0}, Lvk/b$a;->c(Lvk/b$a;)Liv/f;

    move-result-object v0

    iget-object v1, p0, Lvk/b$a$a;->b:Lvk/b$a;

    iget-object v1, v1, Lvk/b$a;->c:Lvk/b;

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Liv/f;->a(Liv/d;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvk/b$a$a;->b:Lvk/b$a;

    invoke-static {v0}, Lvk/b$a;->c(Lvk/b$a;)Liv/f;

    move-result-object v0

    iget-object v1, p0, Lvk/b$a$a;->b:Lvk/b$a;

    iget-object v1, v1, Lvk/b$a;->c:Lvk/b;

    iget-object v2, p0, Lvk/b$a$a;->a:Liv/x;

    invoke-interface {v0, v1, v2}, Liv/f;->b(Liv/d;Liv/x;)V

    return-void
.end method
