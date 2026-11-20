.class public final Lhq/y$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhq/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lhq/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhq/y;

    invoke-direct {v0}, Lhq/y;-><init>()V

    sput-object v0, Lhq/y$a;->a:Lhq/y;

    return-void
.end method
