.class public Lim/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/universalapp/messagebus/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lim/f;->G(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lim/f;


# direct methods
.method public constructor <init>(Lim/f;)V
    .locals 0

    iput-object p1, p0, Lim/f$e;->a:Lim/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lim/f$e;->a:Lim/f;

    invoke-virtual {v0, p1}, Lim/f;->D(Lorg/json/JSONObject;)V

    return-void
.end method
