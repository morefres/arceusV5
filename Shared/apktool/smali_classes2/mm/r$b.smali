.class public Lmm/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmm/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# static fields
.field public static final a:Lmm/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmm/r;

    invoke-direct {v0}, Lmm/r;-><init>()V

    sput-object v0, Lmm/r$b;->a:Lmm/r;

    return-void
.end method

.method public static bridge synthetic a()Lmm/r;
    .locals 1

    sget-object v0, Lmm/r$b;->a:Lmm/r;

    return-object v0
.end method
