.class public Luk/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/logging/HttpLoggingInterceptor$Logger;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Luk/c;->a()Lokhttp3/OkHttpClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Luk/c;


# direct methods
.method public constructor <init>(Luk/c;)V
    .locals 0

    iput-object p1, p0, Luk/c$a;->a:Luk/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public log(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rbx.http"

    invoke-static {v0, p1}, Lek/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
