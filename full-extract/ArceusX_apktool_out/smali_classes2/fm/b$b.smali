.class public Lfm/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfm/b;->l(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lfm/b;


# direct methods
.method public constructor <init>(Lfm/b;)V
    .locals 0

    iput-object p1, p0, Lfm/b$b;->a:Lfm/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lfm/b$b;->a:Lfm/b;

    const-string v1, "intensity"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lfm/b;->b(Lfm/b;F)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lfm/b$b;->a:Lfm/b;

    invoke-virtual {p1}, Lfm/b;->q()V

    return-void

    :catch_0
    const-string p1, "HapticProtocol"

    const-string v0, "Failed to parse JSON in UpdateSingletonVibration request"

    invoke-static {p1, v0}, Lek/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
