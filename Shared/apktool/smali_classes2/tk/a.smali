.class public Ltk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ltk/d;
    .locals 3

    new-instance v0, Ltk/h;

    invoke-static {}, Ltk/g;->b()Lokhttp3/OkHttpClient;

    move-result-object v1

    invoke-static {}, Lvk/c;->e()Lvk/c;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ltk/h;-><init>(Lokhttp3/OkHttpClient;Liv/e$a;)V

    invoke-static {}, Ltk/g;->c()Ltk/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltk/h;->i(Ltk/b;)Ltk/d;

    move-result-object v0

    return-object v0
.end method
