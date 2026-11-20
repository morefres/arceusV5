.class public Lhi/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lhi/g;


# direct methods
.method public constructor <init>(Lhi/g;)V
    .locals 0

    iput-object p1, p0, Lhi/g$a;->a:Lhi/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lrk/a;)V
    .locals 1

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lhi/g$a;->b(Lrk/a;Lev/c;)V

    return-void
.end method

.method public b(Lrk/a;Lev/c;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RBHybridModuleLocalization LanguageChangeTrigger.execute() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lrk/a;->f()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.locale"

    invoke-static {v1, v0}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lrk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v2, "newRobloxLanguageValue"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "newRobloxLocaleValue "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lek/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Loi/f;->b(Ljava/lang/String;)Loi/f;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Loh/a;

    invoke-direct {v1, v0}, Loh/a;-><init>(Loi/f;)V

    invoke-virtual {p2, v1}, Lev/c;->j(Ljava/lang/Object;)V

    :cond_0
    const/4 p2, 0x1

    invoke-virtual {p1, p2, v3}, Lrk/a;->a(ZLorg/json/JSONObject;)V

    return-void

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2, v3}, Lrk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
