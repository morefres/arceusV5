.class public final synthetic Lmm/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkm/j;


# instance fields
.field public final synthetic a:Lmm/k;


# direct methods
.method public synthetic constructor <init>(Lmm/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmm/g;->a:Lmm/k;

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Lkm/m;)V
    .locals 1

    iget-object v0, p0, Lmm/g;->a:Lmm/k;

    invoke-static {v0, p1, p2}, Lmm/k;->e(Lmm/k;Lorg/json/JSONObject;Lkm/m;)V

    return-void
.end method
