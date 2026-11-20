.class public Lhi/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lhi/b;


# direct methods
.method public constructor <init>(Lhi/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lhi/b$a;->a:Lhi/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhi/b;Lhi/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhi/b$a;-><init>(Lhi/b;)V

    return-void
.end method


# virtual methods
.method public a(Lrk/a;)V
    .locals 4

    invoke-virtual {p1}, Lrk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "placeID"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ShareGameToChat.execute() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "rbx.hybrid"

    invoke-static {v2, v0}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lrk/a;->a(ZLorg/json/JSONObject;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lrk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
