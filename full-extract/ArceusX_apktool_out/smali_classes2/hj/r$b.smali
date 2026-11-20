.class public final Lhj/r$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lhj/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhj/r;

    invoke-direct {v0}, Lhj/r;-><init>()V

    sput-object v0, Lhj/r$b;->a:Lhj/r;

    return-void
.end method

.method public static bridge synthetic a()Lhj/r;
    .locals 1

    sget-object v0, Lhj/r$b;->a:Lhj/r;

    return-object v0
.end method
