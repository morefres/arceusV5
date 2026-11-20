.class public Lrk/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic a:Lrk/d;


# direct methods
.method public constructor <init>(Lrk/d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lrk/d$c;->a:Lrk/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrk/d;Lrk/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrk/d$c;-><init>(Lrk/d;)V

    return-void
.end method


# virtual methods
.method public executeRoblox(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lrk/d$c;->a:Lrk/d;

    iget-object v0, v0, Lrk/d;->b:Landroid/os/Handler;

    new-instance v1, Lrk/d$c$a;

    invoke-direct {v1, p0, p1}, Lrk/d$c$a;-><init>(Lrk/d$c;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
