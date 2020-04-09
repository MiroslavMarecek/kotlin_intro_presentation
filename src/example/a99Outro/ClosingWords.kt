package example.a99Outro

// --- Getting started with using Kotlin ---

// - 2 versions of IntelliJ IDEA: Community and Ultimate
//   Ultimate is paid, you can use EAP(beta) version for free

// - Looking for something? Google(surprised?).
//   Kotlin has a complete documentation with examples, provided by JetBrains

// - Converting an old Java project into Kotlin?
//   *DON'T.*
//   - Broken non-null/null type semantics, and unexpected returned nulls/NPEs.
//   - If it's ugly, it will stay ugly, just without semicolons.

// - Still converting an old Java project into Kotlin?
//   At least put a Kotlin wrapper layer on top of the lowest
//   Java you intend to call, and resolve nullability and collections mutability there.

//  Q: "Hey, what about [some weirdness with nullability?]"
//  A: Because of Java interop mess, see https://www.youtube.com/watch?v=2IhT8HACc2E

// Thing we didn't get to:
// - packaged extensive, succinct, out-of-the-box functionality (think List.average() earlier)
// - threads & coroutines
// - extension functions, delegated properties, inline functions...