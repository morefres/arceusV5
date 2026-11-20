.class public Luh/f$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luh/f;->G(Landroid/view/Surface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luh/f$d;

.field public final synthetic b:Luh/f;


# direct methods
.method public constructor <init>(Luh/f;Luh/f$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Luh/f$c;->b:Luh/f;

    iput-object p2, p0, Luh/f$c;->a:Luh/f$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Luh/f$c;->a:Luh/f$d;

    iget-object v0, v0, Luh/f$d;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->initMaquettesSDK(Landroid/app/Activity;)V

    return-void
.end method
