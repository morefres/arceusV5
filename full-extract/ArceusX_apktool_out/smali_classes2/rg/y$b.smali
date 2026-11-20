.class public final Lrg/y$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lrg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrg/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrg/y;-><init>(Lrg/z;)V

    sput-object v0, Lrg/y$b;->a:Lrg/y;

    return-void
.end method

.method public static bridge synthetic a()Lrg/y;
    .locals 1

    sget-object v0, Lrg/y$b;->a:Lrg/y;

    return-object v0
.end method
