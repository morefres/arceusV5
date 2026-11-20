.class public Lhi/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhi/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lhi/h;


# direct methods
.method public constructor <init>(Lhi/h;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lhi/h$b;->a:Lhi/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhi/h;Lhi/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhi/h$b;-><init>(Lhi/h;)V

    return-void
.end method


# virtual methods
.method public a(Lrk/a;)V
    .locals 4

    invoke-virtual {p1}, Lrk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "userId"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    new-instance v2, Loh/g;

    const-string v3, "PROFILE_TAG"

    invoke-direct {v2, v3}, Loh/g;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Loh/g;->c(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Loh/g;->i(Ljava/lang/String;)V

    invoke-static {}, Lev/c;->d()Lev/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lev/c;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lrk/a;->a(ZLorg/json/JSONObject;)V

    :cond_0
    return-void
.end method
