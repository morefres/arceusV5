.class public Lbk/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTheme()Lml/a;
    .locals 1

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0}, Ldk/c;->g()Lml/a;

    move-result-object v0

    return-object v0
.end method
