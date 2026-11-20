.class public Lmm/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmm/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lmm/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmm/l;

    invoke-direct {v0}, Lmm/l;-><init>()V

    sput-object v0, Lmm/l$a;->a:Lmm/l;

    return-void
.end method

.method public static bridge synthetic a()Lmm/l;
    .locals 1

    sget-object v0, Lmm/l$a;->a:Lmm/l;

    return-object v0
.end method
