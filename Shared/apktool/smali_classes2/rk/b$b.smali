.class public Lrk/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrk/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lrk/b;


# direct methods
.method public constructor <init>(Lrk/b;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lrk/b$b;->a:Lrk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrk/b;Lrk/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrk/b$b;-><init>(Lrk/b;)V

    return-void
.end method


# virtual methods
.method public a(Lrk/a;)V
    .locals 3

    invoke-virtual {p1}, Lrk/a;->f()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "functionName"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lrk/b$b;->a:Lrk/b;

    invoke-virtual {v1, v0}, Lrk/b;->c(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lrk/a;->a(ZLorg/json/JSONObject;)V

    return-void
.end method
