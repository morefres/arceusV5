.class public Lpl/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpl/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:Lpl/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpl/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpl/j;-><init>(Lpl/k;)V

    sput-object v0, Lpl/j$a;->a:Lpl/j;

    return-void
.end method

.method public static bridge synthetic a()Lpl/j;
    .locals 1

    sget-object v0, Lpl/j$a;->a:Lpl/j;

    return-object v0
.end method
