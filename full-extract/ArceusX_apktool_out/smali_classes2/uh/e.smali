.class public final synthetic Luh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Luh/f;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Luh/f$h;


# direct methods
.method public synthetic constructor <init>(Luh/f;Landroid/content/Context;Luh/f$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/e;->a:Luh/f;

    iput-object p2, p0, Luh/e;->b:Landroid/content/Context;

    iput-object p3, p0, Luh/e;->c:Luh/f$h;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Luh/e;->a:Luh/f;

    iget-object v1, p0, Luh/e;->b:Landroid/content/Context;

    iget-object v2, p0, Luh/e;->c:Luh/f$h;

    invoke-static {v0, v1, v2}, Luh/f;->c(Luh/f;Landroid/content/Context;Luh/f$h;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
