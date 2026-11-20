.class public Lkm/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lorg/json/JSONObject;

.field public final d:Lkm/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lkm/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkm/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lkm/b;->b:Ljava/lang/String;

    iput-object p4, p0, Lkm/b;->d:Lkm/g;

    iput-object p3, p0, Lkm/b;->c:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public final a()Lkm/g;
    .locals 1

    iget-object v0, p0, Lkm/b;->d:Lkm/g;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkm/b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lkm/b;->c:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkm/b;->a:Ljava/lang/String;

    return-object v0
.end method
