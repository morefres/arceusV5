.class public final Lmr/b2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmr/b2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Lmr/b2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmr/b2;

    invoke-direct {v0}, Lmr/b2;-><init>()V

    sput-object v0, Lmr/b2$a;->a:Lmr/b2;

    return-void
.end method
