.class public final synthetic Lim/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkm/i;


# instance fields
.field public final synthetic a:Lim/f;


# direct methods
.method public synthetic constructor <init>(Lim/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim/c;->a:Lim/f;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lkm/l;
    .locals 1

    iget-object v0, p0, Lim/c;->a:Lim/f;

    invoke-virtual {v0, p1}, Lim/f;->J(Lorg/json/JSONObject;)Lkm/l;

    move-result-object p1

    return-object p1
.end method
