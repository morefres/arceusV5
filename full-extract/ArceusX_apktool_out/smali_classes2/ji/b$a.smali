.class public Lji/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lji/b;->g()Lji/b$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lji/b;


# direct methods
.method public constructor <init>(Lji/b;)V
    .locals 0

    iput-object p1, p0, Lji/b$a;->a:Lji/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Lji/b;->f()Lji/b;

    move-result-object v0

    new-instance v1, Lji/b$b;

    iget-object v2, p0, Lji/b$a;->a:Lji/b;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lji/b$b;-><init>(Lji/b;Lji/c;)V

    invoke-virtual {v0, v1}, Lih/b;->b(Lih/c;)V

    return-void
.end method
