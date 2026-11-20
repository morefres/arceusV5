.class public Lvg/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/engine/jni/memstorage/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg/b;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvg/b;


# direct methods
.method public constructor <init>(Lvg/b;)V
    .locals 0

    iput-object p1, p0, Lvg/b$b;->a:Lvg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSet(Ljava/lang/String;)V
    .locals 1

    const-string p1, "rbx.browserservice"

    const-string v0, "BrowserService.CloseBrowserWindow"

    invoke-static {p1, v0}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lvg/b$b;->a:Lvg/b;

    new-instance v0, Lvg/b$b$a;

    invoke-direct {v0, p0}, Lvg/b$b$a;-><init>(Lvg/b$b;)V

    invoke-static {p1, v0}, Lvg/b;->b(Lvg/b;Ljava/lang/Runnable;)V

    return-void
.end method
