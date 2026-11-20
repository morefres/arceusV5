.class public final synthetic Lwl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkm/i;


# instance fields
.field public final synthetic a:Lwl/c;


# direct methods
.method public synthetic constructor <init>(Lwl/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwl/a;->a:Lwl/c;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Lkm/l;
    .locals 1

    iget-object v0, p0, Lwl/a;->a:Lwl/c;

    invoke-static {v0, p1}, Lwl/c;->a(Lwl/c;Lorg/json/JSONObject;)Lkm/l;

    move-result-object p1

    return-object p1
.end method
