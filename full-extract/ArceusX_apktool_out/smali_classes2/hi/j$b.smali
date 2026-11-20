.class public Lhi/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lhi/j;


# direct methods
.method public constructor <init>(Lhi/j;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lhi/j$b;->a:Lhi/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhi/j;Lhi/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhi/j$b;-><init>(Lhi/j;)V

    return-void
.end method


# virtual methods
.method public a(Lrk/a;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleOverlay SetSubmitState.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lrk/a;->f()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RBHybridModuleOverlay"

    invoke-static {v0, p1}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
